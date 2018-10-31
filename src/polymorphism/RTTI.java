package polymorphism;

public class RTTI {

    public static void main(String[] args) {

        Useful[] usefuls = {
                new Useful(), new MoreUseful(),
                new BestUseful(), new MostUseful()
        };

        usefuls[0].f();
        ((MoreUseful)usefuls[1]).x();
        ((BestUseful)usefuls[2]).x();
        ((BestUseful)usefuls[3]).x();  // ClassCastException

    }


}

class Useful {
    public void f() {
        System.out.println("useful f()");
    }

    public void g() {
        System.out.println("useful g()");
    }
}

class MoreUseful extends Useful {
    public void f() {
        System.out.println("More f()");
    }

    public void g() {
        System.out.println("More g()");
    }

    public void x() {
        System.out.println("More x()");
    }
}

class BestUseful extends Useful {
    public void f() {
        System.out.println("Best f()");
    }

    public void g() {
        System.out.println("Best g()");
    }

    public void x(){
        System.out.println("Best x()");
    }
}

class MostUseful extends Useful {
    public void f() {
        System.out.println("Most f()");
    }

    public void g() {
        System.out.println("Most g()");
    }


}



