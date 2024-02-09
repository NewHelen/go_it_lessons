package module7.dz4;

import java.util.Arrays;

public final class Phrase {
    private final String[] words;

    // Публічний конструктор, який приймає копію масиву слів
    public Phrase(String[] words){
        this.words = Arrays.copyOf(words, words.length);
    }

    @Override
    public String toString() {
        String str = "";
        for (String el: this.words) {
            str = str.concat(el + " ");
        }
        return str.trim(); // String.join(" ", words);
    }

    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
