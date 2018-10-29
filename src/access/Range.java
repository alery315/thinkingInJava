package access;

public class Range {

    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    public static int[] range(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            result[i] = start + i;
        }
        return result;
    }

    public static int[] range(int start, int end, int step) {
        int size = (int) Math.ceil((end - start) * 1.0 / step);
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = start + i * step;
        }
        return result;
    }

}
