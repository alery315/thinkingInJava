package design.factory;

public class SonyFactory extends AbstractFactory {
    @Override
    public Flyable createFlyable() {
        return new Sony.Plane();
    }

    @Override
    public Moveable createMoveable() {
        return new Sony.Car();
    }

    @Override
    public Writeable createWriteable() {
        return new Sony.Pen();
    }


    public static void main(String[] args) {

        AbstractFactory factory = new SonyFactory();

        Flyable plane = factory.createFlyable();
        plane.fly(100);

        Moveable car = factory.createMoveable();
        car.run(1000);

        Writeable pen = factory.createWriteable();
        pen.write("hello,world");


        factory = new XiaomiFactory();
        plane = factory.createFlyable();
        plane.fly(100);

        car = factory.createMoveable();
        car.run(1000);

        pen = factory.createWriteable();
        pen.write("hello,world");

    }
}
