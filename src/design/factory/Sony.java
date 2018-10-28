package design.factory;

public class Sony{

    public static class Plane implements Flyable{
        public void fly(int height) {
            System.out.println("Sony plane run  " + height);
        }
    }

    public static class Car implements Moveable{
        public void run(int distance) {
            System.out.println("Sony car run  " + distance);
        }
    }

    public static class Pen implements Writeable{

        @Override
        public void write(String s) {
            System.out.println("Sony pen write  " + s);
        }
    }


}
