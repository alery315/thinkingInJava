package rtti;

class Dog {

    private Cat cat;

    public Dog() {

    }

    static {
        System.out.println("dog static");
    }

    @Override
    public String toString() {
        return "dog: wangwang!";
    }
}

class Cat {
    static {
        System.out.println("cat static");
    }

    @Override
    public String toString() {
        return "cat: miaomiao!";
    }
}


public class TestClassLoader {

    static {
        System.out.println("static code");
    }

    public static void main(String[] args) {
        System.out.println("before");
//        try {
//            Class c = Class.forName("rtti.Dog");
//            System.out.println(c.getName());
//            System.out.println(c.getTypeName());
//            System.out.println(c.getCanonicalName());
//            Dog dog1 = (Dog) c.newInstance();
//            System.out.println(dog1);
//            Constructor constructor = c.getConstructor();
//            Dog dog = (Dog) constructor.newInstance();
//            System.out.println(dog);


        System.out.println(Dog.class);
        try {
            Class.forName("rtti.Dog");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(int.class);
        System.out.println(Integer.TYPE);
        System.out.println(Integer.class);

//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

        System.out.println("after");

        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Float.class;

        System.out.println(bounded.isInstance(new Float(12.3)));

    }


}
