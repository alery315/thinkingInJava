package array;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Init {

    public static void main(String... args) {
        int[] a;

        Random rand = new Random(40); //seed为随机数种子,seed相同,按序生成的随机数也一样

        a = new int[rand.nextInt(20)]; //[0-20)的随机数

        System.out.println(a.length);
        System.out.println(Arrays.toString(a));


        Integer[] b = new Integer[rand.nextInt(20)]; //这种不是基本类型,初始化为null

        System.out.println(b.length);

        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(20);
        }


        System.out.println(Arrays.toString(b));


        Integer[] c = {
                new Integer(1),
                new Integer(2),
                3,
        };

        Integer[] d = new Integer[]{
                new Integer(1),
                new Integer(2),
                3,
        };

        System.out.println(c == d);
        System.out.println(c);
        System.out.println(d);

        Other.main(new String[]{"a", "v", "d"});


        String[] strings = new String[rand.nextInt(30)];

        System.out.println("\nstrings' length is " + strings.length);

        for (int i = 0; i < strings.length; i++) {
            strings[i] = new String("string " + i);
        }

        System.out.println(Arrays.toString(strings));


        Other[] others = new Other[rand.nextInt(20)]; // 并不会自动创建对象,目前还是null

        System.out.println(Arrays.toString(others));

        System.out.println();
        System.out.println();

        // 不支持空
        printArray(new Object[]{new Integer(3), new Float(3.14), new Double(11.11)});

        printArray(new Object[]{"123", "456", "789"});

        printArray(new Object[]{new A(), new A(), new String("original")});

        printArrayJavaSE5(11.2, "java SE 5", new Integer(12));

        printArrayJavaSE5((Object[]) new Integer[]{1,2,3,4,5});

        printArrayJavaSE5();

        System.out.println("args:"  + Arrays.toString(args));

    }

    static void printArray(Object[] objects) {

        System.out.println("---------------Object[] objects-------------");

        for (Object o : objects) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    static void printArrayJavaSE5(Object... args) {

        System.out.println("---------------Object... args-------------");

        for (Object o : args) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    static void f(Integer... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }


}

class Other {

    Other(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
    }


}

class A {
}