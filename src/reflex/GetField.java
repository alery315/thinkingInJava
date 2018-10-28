package reflex;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取class对象
        Class stuClass = Class.forName("reflex.Student");

        //获取字段
        System.out.println("--------all public fields---------");
        Field[] fields = stuClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("--------all fields--------");
        fields = stuClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("--------get public field and use it--------");
        Field field = stuClass.getField("name");
        System.out.println(field);

        //获取一个对象
        Object object = stuClass.getConstructor().newInstance();

        //为字段赋值
        field.set(object, "jay");

        Student student = (Student) object;
        System.out.println("public name is :" + student.name);

        System.out.println("--------get private field and use it--------");
        field = stuClass.getDeclaredField("phone");
        System.out.println(field);
        field.setAccessible(true);
        field.set(object, "17702551234");
        System.out.println("now student object is:" + student);
    }
}
