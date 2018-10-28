package array;


public class GeneratorsTest {
    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.println(type.getSimpleName() + ": ");

            try {
                Generator<?> g = (Generator<?>) type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.print(g.next() + " ");
                }
                System.out.println();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
        System.out.println();
        System.out.println();
        test(RandomGenerator.class);
    }

}
