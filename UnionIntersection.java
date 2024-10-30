import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(2, 3, 4);

        // Find Union
        Set<Integer> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        System.out.println("Union: " + unionSet); // Output: [1, 2, 3, 4]

        // Find Intersection
        Set<Integer> intersectionSet = new HashSet<>(list1);
        intersectionSet.retainAll(list2);
        System.out.println("Intersection: " + intersectionSet); // Output: [2, 3]
    }
}
