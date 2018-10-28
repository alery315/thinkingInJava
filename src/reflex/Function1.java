package reflex;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Function1 {

    /**
     * 反射的作用,比如升级时候,我们不需要Student类了,只需要重新写一个Student2类,然后更改config文件即可
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取类对象
        Class stuClass = Class.forName(getValue("className"));
        //反射获得这个方法
        Method method = stuClass.getMethod(getValue("methodName"), String.class);
        //调用这个方法
        method.invoke(stuClass.getConstructor().newInstance(),"hello,reflex");
    }

    public static String getValue(String key) throws IOException {
        Properties properties = new Properties();//获取配置文件的对象
        FileReader fileReader = new FileReader("src/config.txt");//读取配置文件,相对路径
        properties.load(fileReader);
        fileReader.close();
        return properties.getProperty(key);
    }

}
