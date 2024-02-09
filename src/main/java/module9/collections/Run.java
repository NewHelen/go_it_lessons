package module9.collections;

import java.util.*;

public class Run {
    public static void main(String[] args) {

        /**
         * ArrayList
         */
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Bill");

        System.out.println(names.get(0));
        System.out.println(names.get(1));

        //----------------
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");

//Використовуємо цикл foreach
        for (String planet : planets) {
            System.out.println(planet); //Earth, Mars, Venus
        }

//Використовуємо цикл for з лічильником
        for (int i = 0; i < planets.size(); i++) {
            String planet = planets.get(i);
            System.out.println(planet);
        }

//Перший елемент
        System.out.println(planets.get(0));

//Останній елемент
        System.out.println(planets.get(planets.size() - 1));

        /**
         * HashSet
         */
        Set<Integer> numbers = new HashSet<>();
        numbers.add(100);
        numbers.add(100); // ми двічі додали число 100 у множину, але воно додалося лише один раз

        System.out.println(numbers.size()); //1

        //---------------------

        String[] allNames = {"John", "Elon", "John", "Bill", "Bill"};

        Set<String> uniqueNames = new HashSet<>();
        for(String name: allNames) {
            uniqueNames.add(name);
        }

        for(String name: uniqueNames) {
            System.out.println(name); //John, Elon, Bill
        }

        /**
         * HashMap
         */
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("Java", 100500);

        System.out.println(salaries.get("Java")); //100500

        //----------------------
        Map<String, Integer> salaries2 = new HashMap<>();
        salaries2.put("Java", 5000);
        salaries2.put("Frontend", 2000);

        //Усі професії
        System.out.println("All professions:");
        for(String profession: salaries2.keySet()) {
            System.out.println(profession);
        }

        //Усі зарплати
        System.out.println("All salaries2:");
        for(int salary: salaries2.values()) {
            System.out.println(salary);
        }

        //Зарплата Java-розробника
        System.out.println("Java salary is " + salaries2.get("Java"));

    }
}
