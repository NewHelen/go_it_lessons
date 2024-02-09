package module7.dz18;

public class AvgWordLength {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }

    // приймає рядок, що складається зі слів, розділених рівно одним пробілом,
    // повертає середню довжину слова у цьому рядку
    public double count(String phrase){
        String[] words = phrase.split("\\s+");
        double totalCount = 0;
        for (String word:words) {
            totalCount = totalCount + word.length();
        }
        return totalCount/ words.length;
    }
}
