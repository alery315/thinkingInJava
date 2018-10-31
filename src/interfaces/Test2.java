package interfaces;

public abstract class Test2 {

    public abstract void print();

    Test2() {
        print();
    }

    public static void main(String[] args) {

        new Test3().print();
        fun(new Methods());
    }

    public static void fun(NoMethods no) {
       no.fun();
    }

}

class Test3 extends Test2 {

    private int i = 9;

    @Override
    public void print() {
        System.out.println("i = " + i);
    }
}


abstract class NoMethods {
    abstract void fun();
}


class Methods extends NoMethods {
    public void fun() {
        System.out.println("Methods.fun()");
    }
}