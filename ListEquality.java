import java.util.*;

public class ListEquality {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        boolean areEqual = list1.equals(list2);
        System.out.println("Are the lists equal? " + areEqual); // Output: true
    }
}
