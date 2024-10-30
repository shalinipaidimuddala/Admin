import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Collections.reverse(numbers);
        System.out.println(numbers); // Output: [5, 4, 3, 2, 1]
    }
}
