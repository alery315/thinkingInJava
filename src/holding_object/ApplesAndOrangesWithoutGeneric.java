package holding_object;


import java.util.*;

class Apple {
    private static long counter = 10001;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}

class Orange{

}

class Apple1 extends Apple {

}

class Apple2 extends Apple {

}

class Apple3 extends Apple {

}

class Apple4 extends Apple {

}

public class ApplesAndOrangesWithoutGeneric {

    public static void main(String[] args) {
//        @SuppressWarnings("unchecked")
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //! apples.add(new Orange());

        apples.add(new Apple1());
        apples.add(new Apple2());
        apples.add(new Apple3());
        apples.add(new Apple4());


        for (int i = 0; i < apples.size(); i++) {

            System.out.println(apples.get(i).getId());

        }

        for (Apple apple : apples) {
            System.out.println(apple);
        }


//        Collection<Integer> c = new ArrayList<>();
        Collection<Integer> c = new HashSet<>();
//        Collection<Integer> c = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }

        c.add(-1);

        for (Integer integer : c) {
            System.out.println(integer);
        }


    }

}
