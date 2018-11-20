package holding_object;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        Collections.addAll(set1, "a b c d e f g h i".split(" "));
        set1.add("m");
        System.out.println(set1);
        System.out.println(set1.contains("d"));
        System.out.println(set1.contains("u"));

        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "h i g".split(" "));
        System.out.println(set1 + "," + set2);
        System.out.println(set1.containsAll(set2));

        set2.add("p");
        System.out.println(set1 + "," + set2);
        System.out.println(set1.containsAll(set2));

        // 删除set2里的所有内容,没有的就算了
        set1.removeAll(set2);
        System.out.println(set1 + "," + set2);

        Collections.addAll(set1, "a b c d p i".split(" "));

        // 交集
        set1.retainAll(set2);
        System.out.println(set1 + "," + set2);




    }


}
