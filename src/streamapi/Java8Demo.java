package streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        String str = "i love java";

        // To count the occurence of each character in string
        Map<String, Long> collect = Arrays.stream(str.split(""))
                .filter(s -> !s.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        // To find all duplicate
        String s1 = Arrays.stream(str.split(""))
                .filter(s -> !s.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();

        System.out.println(s1);


    }
}
