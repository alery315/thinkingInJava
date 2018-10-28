package array;

import java.util.Arrays;
import java.util.Random;

public class IceCream {

    private static Random random = new Random(23);

    static final String[] FLAVORS = {
            "Ice1","Ice2","Ice3","Ice4","Ice5","Ice6","Ice7",
    };

    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length)
            throw new IllegalArgumentException("too big n!");
        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = random.nextInt(FLAVORS.length);
            }while (picked[t]);  // 保证了选取不重复
            results[i] = FLAVORS[t];
            picked[t] = true;
        }
        return results;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(random.nextInt(FLAVORS.length))));
        }
    }


}
