package holding_object;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class IterableClass implements Iterable<String> {

    protected String[] words = "And that is how we know the Earth to be shaped.".split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    static <T> void test(Iterable<T> iterable) {
        for (T t : iterable) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        for (String s : new IterableClass()) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 环境变量
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 厉害,啥类型都可以
        test(Arrays.asList("1", "2", 4, 3.14));

    }
}
