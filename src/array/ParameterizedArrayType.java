package array;

import java.util.Arrays;

public class ParameterizedArrayType {

    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);

        System.out.println(Arrays.toString(ints2));


        // 以某个数据填充数组
        Arrays.fill(ints, 3);

        System.out.println(Arrays.toString(ints));



    }

}

class ClassParameter<T>{
    public T[] f(T[] args) {
        return args;
    }
}


class MethodParameter {
    public static <T> T[] f(T[] args) {
        return args;
    }
}

class User {
    String name;
    String age;
}