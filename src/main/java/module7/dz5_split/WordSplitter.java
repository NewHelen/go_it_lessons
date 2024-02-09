package module7.dz5_split;

import java.util.Arrays;

public class WordSplitter {

    // Метод приймає на вхід рядок, поділяє його на слова, і повертає масив рядків
    public String[] split(String phrase){

        //регулярний вираз \s відповідає одному символу пробілу,
        // тоді як \ s+ відповідатиме одному або декільком символам пробілу
        String[] words = phrase.toLowerCase().split("\\s+");

        return words;
    }

    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
