package design.factory;

public abstract class AbstractFactory {
    public abstract Flyable createFlyable();
    public abstract Moveable createMoveable();
    public abstract Writeable createWriteable();

}
