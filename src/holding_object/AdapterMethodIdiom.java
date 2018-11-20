package holding_object;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> collection) {
        super(collection);
    }

    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }


        };
    }

}


public class AdapterMethodIdiom {

    public static void main(String[] args) {

        ReversibleArrayList<String> ral = new ReversibleArrayList<>(
                Arrays.asList("To be or not to be".split(" "))
        );

        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s : ral.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();

        Random random = new Random(47);
        Integer[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list1 = Arrays.asList(ia);

        System.out.println(list1);

        // 会改变原有数组的顺序
        Collections.shuffle(list1, random);

        System.out.println(list1);

        for (Integer integer : ia) {
            System.out.print(integer + " ");
        }
        System.out.println();

    }
}
