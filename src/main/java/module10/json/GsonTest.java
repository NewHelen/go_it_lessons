package module10.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTest {
    public static void main(String[] args) {

        Person person = new Person("Bill", 30, true, 1.78);

        //Перевести об'єкт у JSON-формат
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);

        System.out.println(json);


        // Отримати об'єкт з JSON-формату
        String json2 = "{\n" +
                "  \"name\": \"Bill\",\n" +
                "  \"age\": 30,\n" +
                "  \"married\": true,\n" +
                "  \"height\": 1.78\n" +
                "}";

        Person person2 = new Gson().fromJson(json2, Person.class); // під час десеріалізації з JSON нам потрібно вказувати клас об'єкта, який ми десеріалізуємо
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.isMarried());
        System.out.println(person2.getHeight());
    }
}
