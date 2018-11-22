package string;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {

    @Override
    public String toString() {
        return "address: " + super.toString();
    }

    public static void main(String[] args) {


        List<InfiniteRecursion> v = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }

        System.out.println(v);

        String s = "abcdefghij";
        System.out.println(s.getBytes());

        System.out.println(s.concat("ig nb!"));

        int x = 5;
        double y = 3.145;

        System.out.println("Row 1 : [" + x + " " + y + "]" );

        System.out.printf("Row 1 : [%d %.2f]\n", x, y);

        String name = "alery";

        System.out.println(String.format("hello, %s", name));


    }

}
