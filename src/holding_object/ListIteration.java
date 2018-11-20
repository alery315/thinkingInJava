package holding_object;

import java.util.*;

public class ListIteration {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            list.add("wendy" + i);
        }

        ListIterator iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println("previous: " + iterator.previousIndex() + ", " + iterator.next() +
                    ", next:" + iterator.nextIndex() + ";");
        }

        iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", " + iterator.nextIndex() +
                    ", " + iterator.previousIndex() + ";");
        }

        iterator = list.listIterator(3);

        while (iterator.hasNext()) {
            iterator.next();
            iterator.set("wendy" + new Random().nextInt(20));
        }

        System.out.println(list);

        List linked_list = new LinkedList(list);

        System.out.println(linked_list);



    }


}
