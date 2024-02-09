package module7.dz13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordDeleter {
    public String remove(String phrase, String[] words) {
        // Розділити рядок на слова
        String[] wordsInPhrase = phrase.split(" ");

        // Створити новий список для зберігання слів без видалених
        List<String> resultWords = new ArrayList<>();

        // Додати слова до нового списку, якщо вони не знаходяться в масиві видаляємих слів
        for (String word : wordsInPhrase) {
            if (!Arrays.asList(words).contains(word)) {
                resultWords.add(word);
            }
        }

        // Об'єднати слова в новий рядок, розділені пробілами
        String resultPhrase = String.join(" ", resultWords);

        return resultPhrase;
    }

    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}
