package holding_object;


import java.util.*;

public class AddingGroups {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 9));
        Integer[] moreInts = new Integer[]{5, 8, 10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection, moreInts);
        Collections.addAll(collection, 200, 300, 400, 499);

        for (Integer integer : collection) {
            System.out.println(integer);
        }


        // 底层表示为数组,无法改变大小,但是可以改变已有的元素
        List<Integer> list = Arrays.asList(18, 19, 20);
        list.set(1, -2);
//        list.add(12);

        for (Integer integer : list) {
            System.out.println(integer);
        }


    }


}

