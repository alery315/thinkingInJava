package holding_object;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetOfInteger {


    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 1000; i++) {
            set.add(random.nextInt(22));
        }
        System.out.println(set);

    }


}
