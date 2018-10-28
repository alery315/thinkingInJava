package design.singleton;

public class Singleton {

    static {
        System.out.println("singleton");
    }

    private Singleton() {

    }


    private static class SingletonContainer{
        static {
            System.out.println("singleton container");
        }
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonContainer.singleton;
    }


    public static void main(String[] args) {

        Singleton singleton = getInstance();




    }


}
