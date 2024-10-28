import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueSet = new LinkedHashSet<>(Arrays.asList(arr));

        Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
