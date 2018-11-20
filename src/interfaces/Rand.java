package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface RandomAble {
    String rand();
}

interface RandomAbleFactory {
    RandomAble getRandomAble();
}

class Coin implements RandomAble {
    @Override
    public String rand() {
        return new Random().nextBoolean() ? "正" : "反";
    }
}

class CoinFactory implements RandomAbleFactory {

    @Override
    public RandomAble getRandomAble() {
        return new Coin();
    }
}

class Dice implements RandomAble {
    @Override
    public String rand() {
        return String.valueOf(new Random().nextInt(6) + 1);
    }
}

class DiceFactory implements RandomAbleFactory {

    @Override
    public RandomAble getRandomAble() {
        return new Dice();
    }
}

public class Rand {


    public static void play(RandomAbleFactory factory) {
        System.out.println(factory.getRandomAble().rand());
    }


    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            play(new DiceFactory());
            play(new CoinFactory());
        }

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        try {
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("越界了,沙雕");
        }
    }







}
