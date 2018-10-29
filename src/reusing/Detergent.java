package reusing;

class Cleaner {

    private String s = "Cleaner";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }
}

class A {
    public A(int i) {
        System.out.println("A");
    }
}


class B {
    public B(int i) {
        System.out.println("B");
    }

}

class C extends A {
    private B b = new B(12);

    public C() {
        super(12);
        System.out.println("C");
    }


}


public class Detergent extends Cleaner {
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {

        Cleaner cleaner = new Cleaner();
        cleaner.dilute();
        cleaner.apply();
        cleaner.scrub();
        System.out.println(cleaner);

        System.out.println("testing extended class:");
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        System.out.println(d);

        C c = new C();

    }

}


