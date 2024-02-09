package module4;

public class Dz17 {

    // метод приймає один параметр sum - кількість грошей, яку потрібно видати,
    // та повертає мінімальну кількість банкнот, якими можна видати цю суму
    // є купюри номіналом в 500, 200, 100, 50, 20, 10, 5, 2 и 1 доларів

    public static int countBanknotes(int sum){
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int index = 0;

        while (sum > 0) {
            if (sum >= banknotes[index]) {
                int notes = sum / banknotes[index];
                count += notes;
                sum -= notes * banknotes[index];
            }
            index++;
        }

        return count;
    }
}
