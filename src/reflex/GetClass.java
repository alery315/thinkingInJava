package reflex;

public class GetClass {

    public static void main(String[] args) {
        /**
         * 一个类运行时候只会加载一个class对象!!
         * 三种获取class对象的方法,特殊化为Student类
         * 1.new Student().getClass()
         * 2.Student.class
         * 3.Class.forName("reflex.Student")
         */

        // 1
        Class stuClass1 = new Student().getClass();
        System.out.println(stuClass1.getName());

        // 2
        Class stuClass2 = Student.class;
        System.out.println(stuClass1 == stuClass2);

        // 3
        try {
            Class stuClass3 = Class.forName("reflex.Student");
            System.out.println(stuClass1 == stuClass3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
