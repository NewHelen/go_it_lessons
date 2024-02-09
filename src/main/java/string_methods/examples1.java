package string_methods;

public class examples1 {

    public static void main(String[] args){

        /**
         * String
         */
        // Порівняння рядків
        String name1 = "Igor";
        String name2 = "Igor";

        System.out.println(name1.equals(name2)); // Буде true

        //Довжина рядка
        String planet = "Earth";
        int length = planet.length(); //5 - тому що у слові Earth 5 символів
        System.out.println(length);

        //З'єднання рядків
        //Для цього є метод join() -статичний
        String result = String.join("/", "apple", "banana", "kiwi");
        System.out.println("Result: " + result);

        // Чи є в рядку інший рядок
        String phrase = "Java is great language";
        String word = "java";

        boolean phraseContainsWord = phrase.toLowerCase().contains(word.toLowerCase());
        System.out.println("exists: " + phraseContainsWord);

        // Індекс символу
        String language = "english";
        char thirdChar = language.charAt(2); //g
        System.out.println(thirdChar);

        // Починається або закінчується рядок іншим рядком
        String programmingLanguage = "java";
        System.out.println(programmingLanguage.startsWith("jav")); //true
        System.out.println(programmingLanguage.endsWith("ava")); //true

    }

}
