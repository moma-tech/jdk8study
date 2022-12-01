package scratches;

import java.util.*;

/**
 * sort map by key
 * Created by ivan on 17-5-23.
 **/
public class SortByMapKey {
    public static void main(String[] args) {
        Map<String, Object> hashmap = new HashMap<>();

        hashmap.put("TIME21", 0);
        hashmap.put("TIME11", 0);
        hashmap.put("TIME1", 0);
        hashmap.put("TIME2", 0);

        TreeMap<String, Object> treemap = new TreeMap<>(
                (o1, o2) -> {
                    Integer i1 = Integer.parseInt(o1.substring(4));
                    Integer i2 = Integer.parseInt(o2.substring(4));
                    return i1.compareTo(i2);
                }
        );

        treemap.put("TIME21", 0);
        treemap.put("TIME11", 0);
        treemap.put("TIME1", 0);
        treemap.put("TIME2", 0);

        Set<String> keySet = treemap.keySet();
        for (String aKeySet : keySet) {
            System.out.println(aKeySet);
        }

    }

}
