package module6.dz25;

public class AvgDamageCalculator {

    public int calculateAvg(int[] samples) {

        int sum = 0;
        try {
            for (int sampleValue : samples) {
                sum += sampleValue;
            }
            return sum / samples.length;

        } catch (ArithmeticException exception) {
           // System.out.println("0");
        }
        return 0;
    }
}
