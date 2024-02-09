package module7.dz25_useStringBuilder;

public class NumberJoiner {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }

    //склеює масив чисел у рядок
    public String join(int[] numbers) {

        StringBuilder result = new StringBuilder();

        for(int i =0; i<numbers.length; i++) {
            result.append(numbers[i]);  // append (String str) - приєднує рядок
        }
        return result.toString();
    }

}
