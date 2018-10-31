package polymorphism;

abstract class Glyph {

    abstract void fun();

    public void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph before draw()");
        draw();
        System.out.println("Glyph after draw()");
    }
}

class RoundGlyph extends Glyph {

    private int radius = 1;

    RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius : " + radius);
    }

    @Override
    void fun() {

    }

    public void draw() {
        System.out.println("RoundGlyph.draw(), radius : " + radius);
    }

}

public class PolyConstructors {

    public static void main(String[] args) {
        new RoundGlyph(5);
    }

}
