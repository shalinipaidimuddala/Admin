import java.util.*;
public class MostFrequentElement {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        String mostFrequent = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Most frequent element: " + mostFrequent); // Output: "apple"
    }
}
