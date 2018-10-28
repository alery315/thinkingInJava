package reflex;

public class Student {
    // -----------------多种字段----------------
    public String name;
    protected int age;
    char sex;
    private String phone;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                '}';
    }

    // ----------------多种成员方法--------------

    public void show1(String s) {
        System.out.println("public param:String show1() s=" + s);
    }

    protected void show2() {
        System.out.println("protected non-param show2()");
    }

    void show3() {
        System.out.println("default non-param show3()");
    }

    private String show4(int age) {
        System.out.println("private return String param int show4()" + age);
        return "abcdefg";
    }

    // ----------------多种构造方法--------------

    // 默认的构造方法
    Student(String string) {
        System.out.println("默认的构造方法" + string);
    }

    // 无参的构造方法
    public Student() {
        System.out.println("公有无参方法");
    }

    // 公有一个参数构造方法
    public Student(char name) {
        System.out.println("公有一个参数 name=" + name);
    }

    // 多个参数的构造方法
    public Student(String name, int age) {
        System.out.println("多个参数的方法 " + name + ":" + age);
    }

    protected Student(boolean b) {
        System.out.println("受保护的构造方法 参数:" + b);
    }

    // 私有的构造方法
    private Student(int age) {
        System.out.println("私有的构造方法 age=" + age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static void main(String[] args) {
        System.out.println("main has been invoked, len(args) is " + args.length);
    }
}
