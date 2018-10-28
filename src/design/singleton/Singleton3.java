package design.singleton;

public class Singleton3 {


    private Singleton3() {

    }

    private static Singleton3 singleton3 = null;


    public static Singleton3 getInstance() {
        // 这里相当于synchronized static Singleton3 getInstance()

        synchronized (Singleton3.class) {
            if (singleton3 == null) {
                singleton3 = new Singleton3();
            }
        }

        return singleton3;
    }

}
