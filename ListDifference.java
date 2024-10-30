import java.util.*;

public class ListDifference {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        List<Integer> difference = new ArrayList<>(list1);
        difference.removeAll(list2);
        System.out.println("Difference: " + difference); // Output: [1, 2]
    }
}
