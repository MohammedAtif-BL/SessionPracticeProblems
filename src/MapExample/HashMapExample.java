package MapExample;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        String str = "hello World";
        String resultStr = str.replace(" ","");
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for(char c : resultStr.toCharArray()){
            characterCount.put(c,characterCount.getOrDefault(c,0)+1);
        }

        System.out.println(characterCount);
    }
}
