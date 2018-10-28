package control;

public class WhileTest {

    public static void main(String[] args) {

        while (condition()) {
            System.out.println("inside while");
        }

        System.out.println("exit while");

    }

    public static boolean condition() {
        boolean result = Math.random() < 0.55;
        System.out.println("result : " + result);
        return result;
    }


}
