package holding_object;

import java.util.*;

public class PrintingContainers {

    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("tiger");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("dog", "510");
        map.put("cat", "Bos");
        return map;
    }

    public static void main(String[] args) {

        System.out.println("Array " + fill(new ArrayList<>()));
        System.out.println("Linked " + fill(new LinkedList<>()));
        System.out.println("HashSet " + fill(new HashSet<>()));
        System.out.println("TreeSet " + fill(new TreeSet<>()));
        System.out.println("LinkedHashSet " + fill(new LinkedHashSet<>()));
        System.out.println("HashMap " + fill(new HashMap<>()));
        System.out.println("TreeMap " + fill(new TreeMap<>()));
        System.out.println("LinkedHashMap " + fill(new LinkedHashMap<>()));



        // Collections.shuffle() 混淆 , 可以添加random变量
        List<String> list = (List<String>) fill(new LinkedList<>());
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        // toArray()
        String[] s = list.toArray(new String[0]); // 返回参数指定类型的数组
        System.out.println(Arrays.toString(list.toArray())); // 默认返回object数组
        System.out.println(Arrays.toString(s));

        // contains() true false
        // indexOf() -1 index
        // remove()
        // 以上三个都用到equals去比较

        // get()
        // add() add(index, object) 在index处插入
        // set(index, object)

        list.set(3, "510");
        list.add(2, "张威");
        System.out.println(list);

        // subList(from, to)
        // containsAll(subList)
        // remove(index)
        // removeAll(Collection c)
        // addAll(Collection c) addAll(index, c)

        // clear()
        // isEmpty()

    }



}
