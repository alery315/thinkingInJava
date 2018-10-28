package design.factory;

public class Xiaomi {

    public static class Plane implements Flyable{
        public void fly(int height) {
            System.out.println("Xiaomi plane run  " + height);
        }
    }

    public static class Car implements Moveable{
        public void run(int distance) {
            System.out.println("Xiaomi car run  " + distance);
        }
    }

    public static class Pen implements Writeable{

        @Override
        public void write(String s) {
            System.out.println("Xiaomi pen write  " + s);
        }
    }


}
