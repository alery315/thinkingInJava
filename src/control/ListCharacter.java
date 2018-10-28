package control;

public class ListCharacter {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLetter(c)) {
                System.out.println("value: " + (int) c + " character: " + c);
            }
        }


        for (char c : "hello,world!".toCharArray()) {
            System.out.println(c + " ");
        }


        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        // 输入iter + tab键 生成foreach

        fibonacci(30);

    }

    static void fibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        if (n >= 2)
            arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
