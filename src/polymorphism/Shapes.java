package polymorphism;

import java.util.Random;

class Shape {
    public void draw() {
        System.out.println("Shape draw()");
    }

    public void print(String s) {
        System.out.println(toString() + s);
    }

    @Override
    public String toString() {
        return "Shape{}";
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }

    @Override
    public String toString() {
        return "Circle{}";
    }
}


class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square draw()");
    }

    @Override
    public String toString() {
        return "Square{}";
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle draw()");
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }
}

class RandomShapeGenerator {
    private Random random = new Random(922);
    public Shape next() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();

        }
    }
}


public class Shapes {

    private static RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = generator.next();
        }

        for (Shape shape : shapes) {
            System.out.println(shape);
            shape.draw();
            shape.print("hello");
            System.out.println();
        }


    }

}
