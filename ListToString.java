import java.util.*;
import java.util.stream.Collectors;

public class ListToString {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        String result = numbers.stream()
                               .map(String::valueOf)
                               .collect(Collectors.joining(", "));
        System.out.println(result); // Output: "1, 2, 3"
    }
}
