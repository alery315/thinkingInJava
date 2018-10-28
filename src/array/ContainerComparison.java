package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere" + id;
    }
}


public class ContainerComparison {
    public static void main(String[] args) {

        BerylliumSphere[] spheres = new BerylliumSphere[5];

        for (int i = 0; i < spheres.length; i++) {
            spheres[i] = new BerylliumSphere();
        }

        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);


        List<BerylliumSphere> sphereList = new ArrayList<>();
        for (int i = 0; i < spheres.length; i++) {
            sphereList.add(new BerylliumSphere());
        }

        System.out.println(sphereList);
        System.out.println(sphereList.get(4));


        int[] ints = new int[]{0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(ints));
        System.out.println(ints[4]);

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integers.add(i+1);
        }
        integers.addAll(Arrays.asList(97, 98, 99, 100));
        System.out.println(integers);

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 3};

        System.out.println(a == b);

        String c = "abc";
        String d = "abc";
        System.out.println(c == d);

        char[] chars = new char[5];
        System.out.println((int)chars[3]); //初始化为ascii码为0的字符

    }
}
