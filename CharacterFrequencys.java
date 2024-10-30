import java.util.*

public class CharacterFrequencys {
    public static void main(String[] args) {
        String str = "apple";
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequencyMap); // Output: {a=1, p=2, l=1, e=1}
    }
}
