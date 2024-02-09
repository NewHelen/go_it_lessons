package module7.dz12;
import java.util.HashSet;
import java.util.Set;

public class UniqueCharCounter {

    //повертає кількість унікальних символів у цьому рядку
    public int count(String phrase) {
        // Використовуємо Set для визначення унікальних символів
        Set<Character> uniqueChars = new HashSet<>();

        // Перебираємо символи рядка
        for (char ch : phrase.toCharArray()) {
            // Ігноруємо пробіли
            //if (ch != ' ') {
            // Додаємо символ до множини
            uniqueChars.add(ch);
            //}
        }

        // Повертаємо кількість унікальних символів
        return uniqueChars.size();
    }

        public static void main(String[] args) {
            UniqueCharCounter charCounter = new UniqueCharCounter();

            //3
            System.out.println(charCounter.count("123"));

            //4
            System.out.println(charCounter.count("ab100"));

            //3
            System.out.println(charCounter.count("Java"));

    }
}
