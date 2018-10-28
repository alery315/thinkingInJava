package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraySearch {


    public static void main(String[] args) {

        Integer[] a = new Integer[20];
        Random random = new Random(47);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(200);
        }

        Arrays.sort(a, new ComTypeComparator1());

        System.out.println("sorted : " + Arrays.toString(a));

        while (true) {
            int nextNum = random.nextInt(200);
            int idx = Arrays.binarySearch(a, nextNum);
            Arrays.binarySearch(a, nextNum,new ComTypeComparator1());
            if (idx > -1) {
                System.out.println("find " + nextNum + " idx : " + idx);
                break;
            }
            System.out.println(nextNum + " not found");
        }

    }

}
