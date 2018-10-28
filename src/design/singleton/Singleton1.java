package design.singleton;

/**
 * 饿汉式单例模式
 */

public class Singleton1 {

    // 构造方法私有
    private Singleton1() {}

    private static Singleton1 singleton1 = new Singleton1();

    // 静态获取唯一实例
    public static Singleton1 getInstance() {
        return singleton1;
    }

}
