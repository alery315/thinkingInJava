package polymorphism;

class A {
    public A() {
        System.out.println("A()");
    }
}


class B {
    public B() {
        System.out.println("B()");
    }
}

class Super {

    private A a = new A();
    private B b = new B();
    public int field = 0;

    public Super() {
        System.out.println("super()");
    }

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;
    public A a = new A();

    public Sub() {
        System.out.println("sub()");
    }


    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

}



public class FieldAccess {

    public static void main(String[] args) {

        Super sup = new Sub();
        System.out.println("sup : field : " + sup.field);
        System.out.println("sup : getField : " + sup.getField());

        Sub sub = new Sub();
        System.out.println("sub : field : " + sub.field);
        System.out.println("sub : getField : " + sub.getField());
        System.out.println("sub : getField : " + sub.getSuperField());
    }



}
