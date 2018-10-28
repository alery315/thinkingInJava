package design.observer;

public class Observers{

    public static class Observer1 implements Observer {
        @Override
        public void update(String msg) {
            System.out.println("i am observer1, i get the msg:" + msg + ",i will tell my girlfriend");
        }
    }

    public static class Observer2 implements Observer {
        @Override
        public void update(String msg) {
            System.out.println("i am observer2, i get the msg:" + msg + ",i will tell my boyfriend");
        }
    }

}
