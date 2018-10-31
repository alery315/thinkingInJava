package polymorphism;

public class ReferenceCounting {

    public static void main(String[] args) {

        Shared shared = new Shared();
        Composing[] composings = new Composing[]{
                new Composing(shared), new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared), new Composing(shared),
        };

        for (Composing composing : composings) {
            composing.dispose();
            System.gc();
        }

    }

}

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("disposing Shared " + id);
        }
    }

    public String toString() {
        return "shared " + id;
    }

    protected void finalize() {
        if (refcount != 0) {
            System.out.println("error: also referenced");
        } else {
            System.out.println("finalize ok!");
        }
        try {
            super.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("creating composing " + id);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + id);
        shared.dispose();
    }

    public String toString() {
        return "disposing " + id;
    }

}

