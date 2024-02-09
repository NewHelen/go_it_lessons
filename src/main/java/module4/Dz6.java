package module4;

public class Dz6 {

    // завдання 6
    // метод, який поверне масив із тих цін, які закінчуються на цифру 9
    // виклик leavePrice9(new int[] {1, 99, 5, 49}) повертає [99, 49]
    public static int[] leavePrice9(int[] prices){

        // повертає пустий масив якщо масив пустий
        if (prices.length == 0) {
            return new int[0];
        }

        // рахує довжину мосиву для цифр що підходять
        int count = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                count++;
            }
        }

        // ствоє масив з цифрами що закінчуються на 9
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] % 10 == 9){
                result[index] = prices[i];
                index++;
            }
        } return result;

    }
}
