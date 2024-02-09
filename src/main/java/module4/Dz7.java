package module4;

public class Dz7 {

    public static String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){

        // Повернути масив, який складається з двох масивів
        // довжина нового масиву
        int newLength = showcaseStocks.length + warehouseStocks.length;
        String [] result = new String[newLength];

        // наповнити масив
        int index = 0;
        for (int i = 0; i< showcaseStocks.length; i++) {
            result[index] = showcaseStocks[i];
            index++;
        }

        for (int i = 0; i< warehouseStocks.length; i++) {
            result[index] = warehouseStocks[i];
            index++;
        }
        return result;
    }
}
