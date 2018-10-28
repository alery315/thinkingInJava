package array;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.Arrays;
import java.util.Random;

public class MultiDimensionalPrimitiveArray {

    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 2, 3, 4}, {5, 6, 7, 8},
        };

        //This method is designed for converting multidimensional arrays to strings.
        System.out.println(Arrays.deepToString(a));

        int[][][] b = new int[2][3][4];

        System.out.println(Arrays.deepToString(b));

        // 构成数组的每个向量都可以具有任意的长度,称为粗糙数组
        Random random = new Random(3122);
        int[][][] c = new int[random.nextInt(5)][][];

        int count = 0;

        for (int i = 0; i < c.length; i++) {
            c[i] = new int[random.nextInt(5)][];
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = new int[random.nextInt(6)];
                for (int k = 0; k < c[i][j].length; k++) {
                    c[i][j][k] = count++;
                }
            }
        }

        System.out.println(Arrays.deepToString(c));

        //自动装箱也适合数组




    }

}
