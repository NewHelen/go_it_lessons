package module4;

public class Dz8 {

    // приймає список цін, і підсумовує їх, включаючи лише ті,
    // які більш ніж minPrice (включно) та менше ніж maxPrice (включно) і повертає суму
    public static int getPricesSum(int[] prices, int minPrice, int maxPrice){

        // рахує довжину мосиву для цифр що підходять
        int count = 0;
        for (int price : prices) {
            if (price >= minPrice && price <= maxPrice) {
                count++;
            }
        }

        // ствоє масив з цифрами що підходять
        int [] result = new int[count];
        int index = 0;
        for (int el: prices) {
            if (el >= minPrice && el <= maxPrice){
                result [index] = el;
                index ++;
            }
        }

        // сума всіх цифр масиву
        int sum = 0;
        for (int el: result){
            sum = sum + el;
        }
        return sum;
    }
}
