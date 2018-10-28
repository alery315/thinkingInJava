package array;

import java.util.Arrays;
import java.util.List;

public class TestArrays {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList(123, "123333", 123.213, new IceCream());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
