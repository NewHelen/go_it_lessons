package module7.dz20;

public class BigOrSmall {

        public static void main(String[] args) {
            //Small
            System.out.println(new BigOrSmall().calculate("Java"));

            //Big
            System.out.println(new BigOrSmall().calculate("JAVA"));

            //Same
            System.out.println(new BigOrSmall().calculate("jAvA"));
        }

    public String calculate(String text){
        int lowercaseCount = 0;
        int uppercaseCount = 0;

        // Лічильники кількості маленьких і великих літер у рядку
        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }

        // Порівнюємо кількість маленьких і великих літер
        if (lowercaseCount > uppercaseCount) {
            return "Small";
        } else if (uppercaseCount > lowercaseCount) {
            return "Big";
        } else {
            return "Same";
        }
    }
}
