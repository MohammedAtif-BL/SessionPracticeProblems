package MapExample;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("asd",2);
        map.put("abc",1);
        map.put("xyz",3);
        System.out.println(map);
        System.out.println("Value: " + map.get("xyz"));
//        System.out.println(map.get(3));

        System.out.println("Contains Key: " +map.containsValue(2));

        map.remove("abc");
        System.out.println(map);

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key);
        }

//        Set<> entries = map.entrySet();
        for (Map.Entry<String, Integer> entries : map.entrySet()){
            System.out.println("Key: "+entries.getKey() + " Value: " +entries.getValue());
        }

        System.out.println(map.size());

        System.out.println("Empty: " +map.isEmpty());

        map.clear();
        System.out.println(map);
    }
}
