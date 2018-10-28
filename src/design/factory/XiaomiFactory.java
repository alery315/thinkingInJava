package design.factory;

public class XiaomiFactory extends AbstractFactory {
    @Override
    public Flyable createFlyable() {
        return new Xiaomi.Plane();
    }

    @Override
    public Moveable createMoveable() {
        return new Xiaomi.Car();
    }

    @Override
    public Writeable createWriteable() {
        return new Xiaomi.Pen();
    }


    public static void main(String[] args) {

        AbstractFactory factory = new XiaomiFactory();

        Flyable plane = factory.createFlyable();
        plane.fly(100);

        Moveable car = factory.createMoveable();
        car.run(1000);

        Writeable pen = factory.createWriteable();
        pen.write("hello,world");
    }
}
