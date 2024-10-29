public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        generatePermutations(str, "");
    }

    public static void generatePermutations(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, ans + ch);
        }
    }
}
