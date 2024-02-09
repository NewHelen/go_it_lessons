package module6.dz8;

public class PowTable {
    public static final int[] POWERS_2;

    // статичний блок
    static {
        POWERS_2 = new int[10];
        for (int i = 0; i < 10; i++) {
            POWERS_2[i] = (i + 1) * (i + 1);
        }
    }
}
