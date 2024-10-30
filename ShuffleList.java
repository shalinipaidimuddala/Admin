import java.util.*;

public class ShuffleList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Collections.shuffle(numbers);
        System.out.println(numbers);
    }
}
