package reflex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Function2 {
    /**
     * 泛型用在编译期间,编译后泛型消失掉,所以可以通过反射来越过泛型检查
     * @param args
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");

        Class listClass = strings.getClass();
        Method method = listClass.getMethod("add", Object.class);

        method.invoke(strings, 100);

        for (Object object : strings) {
            System.out.println(object.getClass().getName() + ":" + object);
        }

    }


}
