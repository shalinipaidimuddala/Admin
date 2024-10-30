import java.util.*;

public class CustomSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 2, 5);
        numbers.sort((a, b) -> {
            if (a % 2 == 0 && b % 2 != 0) return -1;
            else if (a % 2 != 0 && b % 2 == 0) return 1;
            else return a.compareTo(b);
        });
        System.out.println(numbers); // Output: [4, 2, 1, 3, 5]
    }
}
