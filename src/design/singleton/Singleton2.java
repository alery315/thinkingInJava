package design.singleton;

/**
 * 延迟加载方式
 */
public class Singleton2 {

    private Singleton2() {

    }

    private static Singleton2 singleton2 = null;

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }


}
