package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter implements Readable {
    public void fight() {
        System.out.println("fight");
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim{

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}



public class Adventure {

    public static void t1(CanFight x) {
        x.fight();
    }

    public static void t2(CanFly x) {
        x.fly();
    }

    public static void t3(CanSwim x) {
        x.swim();
    }

    public static void t4(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();

        t1(hero);
        t2(hero);
        t3(hero);
        t4(hero);



    }





}
