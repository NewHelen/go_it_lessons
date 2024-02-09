package module7.dz26;

public class PhraseMaker {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }


    //Перепиши існуючий код класу PhraseMaker з використанням класу StringBuilder,
    //щоб позбутися конкатенації рядків у циклі
    public String join(String[] words) {

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                result.append(words[i].toUpperCase());
            } else {
                result.append(words[i].toLowerCase());
            }

            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
