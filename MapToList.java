import java.util.*;

public class MapToList {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        List<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList); // Output: [apple, banana, cherry]
    }
}
