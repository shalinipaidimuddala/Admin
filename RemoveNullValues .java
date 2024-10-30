import java.util.*;

public class RemoveNullValues {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("apple", null, "banana", null, "cherry"));
        items.removeIf(Objects::isNull);
        System.out.println(items); // Output: [apple, banana, cherry]
    }
}
