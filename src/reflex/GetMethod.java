package reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class stuClass = Class.forName("reflex.Student");

        System.out.println("---------all public methods----------");
        Method[] methods = stuClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("------------all declared methods--------");
        methods = stuClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("----------get public show1()----------");
        Method method = stuClass.getMethod("show1", String.class);
        System.out.println(method);

        Object object = stuClass.getConstructor().newInstance();
        method.invoke(object, "周杰伦");

        System.out.println("-------------get private show4()----------");
        method = stuClass.getDeclaredMethod("show4", int.class);
        System.out.println(method);
        method.setAccessible(true);
        Object result = method.invoke(object, 200);
        System.out.println("return is :" + result);


        System.out.println("--------------get main()---------------");

        method = stuClass.getMethod("main", String[].class);
        method.invoke(null, (Object) new String[]{"a", "b", "c"});
        method.invoke(null, new Object[]{new String[]{"a", "c"}});


    }
}
