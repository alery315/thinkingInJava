package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CompType implements Comparable<CompType> {

    int i;
    int j;
    private static Random random = new Random(47);

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static Generator<CompType> generator() {
        return () -> new CompType(random.nextInt(100), random.nextInt(100));
    }

    @Override
    public int compareTo(CompType o) {
//        return i < o.i ? -1 : (i == o.i ? 0 : 1);
        return Integer.compare(i + j, o.i + o.j);
    }

    @Override
    public String toString() {
        return "CompType{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public static void main(String[] args) {
        CompType[] arr = new CompType[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator().next();
        }

        System.out.println(Arrays.toString(arr));

        // 反序排序
//        Arrays.sort(arr, Collections.reverseOrder());

//        Arrays.sort(arr);

        // 自己实现comparator
        Arrays.sort(arr, new ComTypeComparator());

        System.out.println(Arrays.toString(arr));

    }

}

class ComTypeComparator implements Comparator<CompType> {

    @Override
    public int compare(CompType o1, CompType o2) {
        return Integer.compare(o1.j, o2.j);
    }
}

class ComTypeComparator1 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1,o2);
    }

    @Override
    public Comparator<Integer> reversed() {
        return null;
    }

    @Override
    public Comparator<Integer> thenComparing(Comparator<? super Integer> other) {
        return null;
    }

    @Override
    public <U> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Integer> thenComparingInt(ToIntFunction<? super Integer> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Integer> thenComparingLong(ToLongFunction<? super Integer> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Integer> thenComparingDouble(ToDoubleFunction<? super Integer> keyExtractor) {
        return null;
    }
}