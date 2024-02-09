package character_methods;

public class CharacterExamples {
    boolean flag1 = Character.isLetter('s');
    boolean flag2 = Character.isDigit('1');
    boolean flag3 = Character.isSpaceChar(' ');

    public static void main(String[] args) {
        CharacterExamples example = new CharacterExamples();
        System.out.println(example.flag1);
        System.out.println(example.flag2);
        System.out.println(example.flag3);
    }
}
