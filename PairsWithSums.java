import java.util.*;

public class PairsWithSums {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 3, 5, 7, 8, 1);
        int target = 6;
        Set<Integer> seen = new HashSet<>();
        for (int num : numbers) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            seen.add(num);
        }
        // Output: Pair: (4, 2) and Pair: (5, 1)
    }
}
