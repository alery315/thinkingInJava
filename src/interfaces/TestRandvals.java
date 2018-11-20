package interfaces;

import access.Print;

import java.util.Random;

interface Randvals {

    // 默认public static final 保存在静态存储区域
    Random RANDOM = new Random(47);
    int RAND_INT = RANDOM.nextInt(10);
    long RNAD_LONG = RANDOM.nextLong();
    float RNAD_FLOAT = RANDOM.nextFloat() * 10;
    double RAND_DOUBLE = RANDOM.nextDouble() * 10;
}

public class TestRandvals {

    public static void main(String[] args) {

        System.out.println(Randvals.RAND_DOUBLE);
        System.out.println(Randvals.RAND_INT);
        System.out.println(Randvals.RNAD_FLOAT);
        System.out.println(Randvals.RNAD_LONG);

    }

}
