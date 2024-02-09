package module4;

public class Dz5 {

    public static int[] removePrice(int[] prices, int toRemove) {

        int count = 0;
        for (int price : prices) {
            if (price != toRemove) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                result[index] = prices[i];
                index++;
            }
        }

        return result;
    }
}
