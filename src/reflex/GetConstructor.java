package reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstructor {
    public static void main(String[] args) {

        Class stuClass = null;

        try {
            stuClass = Class.forName("reflex.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("--------all public constructors--------");
        Constructor[] constructors = stuClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("--------all declared constructors--------");
        constructors = stuClass.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("--------public non-params constructor--------");
        try {
            Constructor con = stuClass.getConstructor();
            System.out.println(con);
            Object object = con.newInstance();
            System.out.println("object:" + object);
            Student student = (Student) object;
            System.out.println("cast to student:" + student);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        System.out.println("--------private constructors and invoke--------");
        try {
            Constructor con = stuClass.getDeclaredConstructor(int.class);
            System.out.println(con);

            con.setAccessible(true);
            Object object = con.newInstance(12);
            System.out.println(object);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
