package reusing;

class WithFinal {
    private final void f() {
        System.out.println("withFinal : f()");
    }

    private void g() {
        System.out.println("withFinal : g()");
    }

}

class OverridingPrivate extends WithFinal {

    private final void f() {
        System.out.println("OverridingPrivate : f()");
    }

    private void g() {
        System.out.println("OverridingPrivate : g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {


    public final void f() {
        System.out.println("OverridingPrivate2 : f()");
    }

    public void g() {
        System.out.println("OverridingPrivate2 : g()");
    }
}


public class FinalOverridingIllusion {

    public static void main(String[] args) {
        // 这里是public,相当于重新创建了两个新方法,并没有覆写base类的方法
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridingPrivate op = op2;
        // 根本调用不到
        //! op.f();
        //! op.g();

        WithFinal wf = new OverridingPrivate();



    }

}