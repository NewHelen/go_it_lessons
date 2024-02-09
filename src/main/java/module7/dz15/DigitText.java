package module7.dz15;

public class DigitText {
    public boolean detect(String text) {
        // Перевіряємо, чи кожен символ у рядку є цифрою або пробілом
        for (char ch : text.toCharArray()) {
            if (!Character.isDigit(ch) && ch != ' ') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
