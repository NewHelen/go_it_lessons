package module7.dz21;

public class WordCombine {

    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }

    public boolean canCombine(String sourceWord, String targetWord) {

        int length = targetWord.length();
        int count = 0;
        for (char c : targetWord.toLowerCase().toCharArray()) {
            if (sourceWord.toLowerCase().contains(String.valueOf(c))) {
                count++;

            }
        }
        if (length == count) {
            return true;
        }
        return false;
    }
}
