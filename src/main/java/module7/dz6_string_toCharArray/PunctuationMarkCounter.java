package module7.dz6_string_toCharArray;

public class PunctuationMarkCounter {

    // приймає рядок, і повертає кількість знаків пунктуації у цьому рядку
    public int count(String phrase){

        char [] arrayChar = phrase.toCharArray();
        int count =0;
        for (int i = 0; i < arrayChar.length; i ++) {
            if (arrayChar[i] == ',' || arrayChar[i] == '.' || arrayChar[i] == ';'|| arrayChar[i] == ':'|| arrayChar[i] == '!'){
                count = count +1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    PunctuationMarkCounter counter = new PunctuationMarkCounter();

    //2
        System.out.println(counter.count("Hello, world!"));

    //1
        System.out.println(counter.count("This is Sparta!"));

    //1
        System.out.println(counter.count("End."));
  }
}
