package initialize;

public class Test {

    private String s = "1";
    private String s2;

    Test(String s) {
        System.out.println(s);
        System.out.println(s2);
        this.s2 = s;
    }

    @Override
    public String toString() {
        return "Test{" +
                "s='" + s + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Test test = new Test("2");
        System.out.println(test);
    }

}
