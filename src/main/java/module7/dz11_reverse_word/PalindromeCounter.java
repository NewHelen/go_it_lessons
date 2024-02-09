package module7.dz11_reverse_word;

public class PalindromeCounter {

    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }

    public int count(String phrase){
        //розбити рядок на масив слів
        String[] words = phrase.toLowerCase().split("\\s+");

        // порахувати кількість потрібних слів
        int count =0;
        for (String cleanedWord:words) {
            // Перевертаємо слово
            StringBuilder reversedWord = new StringBuilder(cleanedWord).reverse();

            // Порівнюємо оригінальне та перевернуте слово
            if (cleanedWord.equals(reversedWord.toString())){
                count++; //count = count+1;
            }
        }return count;
    }
}
