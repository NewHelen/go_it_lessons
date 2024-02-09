package module7.dz19;

import java.util.Arrays;

public class DigitExtracter {

    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }

    // приймає рядок і повертає масив усіх цифр,
    // які є в цьому рядку, в тому ж порядку, в якому вони зустрічаються
    public int[] extract(String text) {

        char[] chars = text.toCharArray();
        int count = 0;

        // знайти довжину масива для чисел
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }

        // створити масив для чисел
        int[] digits = new int[count];

        // заповнити масив числами
        int count2 = 0;
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                System.out.println(Integer.parseInt(String.valueOf(ch)));
                digits[count2] = Integer.parseInt(String.valueOf(ch));
                count2++;
            }
        }
        return digits;
    }
}
