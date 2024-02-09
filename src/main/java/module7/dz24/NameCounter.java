package module7.dz24;

public class NameCounter {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }

    // Перша літера має бути великою, решта - маленькими.
    //
    //Напиши програму, яка рахуватиме кількість таких слів у тексті.
    public int count(String text){

        String[] words = text.split("\\s+");

        int countWords =0;
        for (String word:words) {
            if (word.length() >= 2){
                if (Character.isUpperCase(word.toCharArray()[0])
                        && Character.isLowerCase(word.toCharArray()[1])) {
                    countWords++;
                }
            }

        }
        return countWords;
    }
}
