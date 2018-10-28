package object;

import java.util.Arrays;
import java.util.Random;

public class PrimitiveType {


    public static void main(String[] args) {

        long start = System.currentTimeMillis();
//
//        int[] arr = new int[90000000];
//
//        Random random = new Random(47);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(9000000);
//        }

//        Arrays.sort(arr);

        // 排千万级开始占明显优势

        //Arrays.parallelSort(arr);


        long end = System.currentTimeMillis();

        System.out.println(end - start);

//        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));

        // library.path=/usr/lib/jvm/java-8-oracle/jre/lib/amd64

        System.out.println(Math.floor(12.33));
        System.out.println(Math.ceil(12.33));
        System.out.println(Math.rint(12.33));
        System.out.println(Math.rint(12.53));

        // 保留两位有效
        System.out.println(Math.round(3.141));

        boolean b = true;

        System.out.println(b);

        long a = 0x7fff;
        System.out.println(Long.toBinaryString(a));

        float f = 1e12f;
        System.out.println(Float.floatToIntBits(f));


        int aa = 2 << 2;
        aa = aa << 2;
        System.out.println(aa);

        System.out.println(aa > 302 ? --aa : --aa);



        System.out.println(a = aa);

    }


}
