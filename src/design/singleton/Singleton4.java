package design.singleton;

public class Singleton4 {

    private Singleton4() {

    }

    private static Singleton4 singleton4 = null;

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }


}
