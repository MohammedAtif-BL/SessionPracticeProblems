package SetExample;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Orange");
        set.add("Apple");
        set.add("Mango");
        set.add("Apple");

        System.out.println(set);

        System.out.println("Contains: " + set.contains("Appl"));

        System.out.println("Size: " +set.size());

        System.out.println("Remove: " +set.remove("Mango"));

        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        set.clear();

        System.out.println(set);
    }
}
