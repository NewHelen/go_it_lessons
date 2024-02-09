package module7.dz10_count_words_in_one_phrase;

public class ShortWordCounter {

    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }

    // Метод приймає на вхід рядок phrase та змінну minLength.
    // Повертає кількість слів, які менші або рівні ніж minLength
    public int count(String phrase, int minLength){
        //розбити рядок на масив слів
        String[] words = phrase.toLowerCase().split("\\s+");
        // порахувати кількість потрубних слів
        int count =0;
        for (String str:words) {
            if (str.length() <= minLength){
                count++; //count = count+1;
            }
        }return count;
    }
}
