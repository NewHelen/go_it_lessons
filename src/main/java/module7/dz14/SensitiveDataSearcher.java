package module7.dz14;

import java.util.Arrays;

public class SensitiveDataSearcher {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }

    public boolean isSensitiveDataPresent(String phrase){

        // Розділити рядок на слова
        String[] wordsInPhrase = phrase.split(" ");

        // Чутливі слова: pass, key, login, email

        for (String el: wordsInPhrase) {

            if (el.toLowerCase().contains("pass")
                    ||el.toLowerCase().contains("key")
                    ||el.toLowerCase().contains("login")
                    ||el.toLowerCase().contains("email") ){
                return true;
            }
        }

        return false;
    }
}
