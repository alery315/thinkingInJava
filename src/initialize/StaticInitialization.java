package initialize;

class Bowl {
    Bowl(int marker) {
        System.out.println("new Bowl : " + marker);
    }

    void f1(int market) {
        System.out.println("f1 : " + market);
    }
}

class Table{
    static Bowl bowl1 = new Bowl(1);
    static Bowl bowl2 = new Bowl(2);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int market) {
        System.out.println("f2 : " + market);
    }

}

class Cupboard {

    Bowl bowl3 = new Bowl(3);

    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int market) {
        System.out.println("f3 : " + market);
    }

    static Bowl bowl5 = new Bowl(5);

}


public class StaticInitialization {


    static Table table = new Table();

    static Cupboard cupboard = new Cupboard();

    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");

        new Cupboard();

        System.out.println("Creating new Cupboard() in main");

        new Cupboard();

        table.f2(1);

        cupboard.f3(1);

    }



}
