package holding_object;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

    public static void main(String[] args) {

        Random random = new Random(47);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }

        System.out.println(map);

        Map<String, String> map1 = new HashMap<>();
        map1.put("dog2", "wendy");
        map1.put("cat", "kitty");
        map1.put("dog1", "wendy666");

        System.out.println(map1);

        System.out.println(map1.containsValue("wendy"));
        System.out.println(map1.containsKey("dog1"));

        System.out.println(map1.entrySet());

        // 遍历修改会反映到原来的HashMap
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.print(entry.getValue() + " ");
            System.out.println(entry.hashCode());
            entry.setValue("hello");
        }

        System.out.println(map1);

    }


}
