import java.util.*;

public class PalindromeChecks {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> reversed = new ArrayList<>(numbers);
        Collections.reverse(reversed);
        boolean isPalindrome = numbers.equals(reversed);
        System.out.println("Is palindrome: " + isPalindrome); // Output: true
    }
}
