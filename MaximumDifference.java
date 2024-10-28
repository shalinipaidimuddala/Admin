public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int maxDiff = findMaxDifference(arr);
        System.out.println("Maximum difference is: " + maxDiff);
    }

    public static int findMaxDifference(int[] arr) {
        int maxDiff = Integer.MIN_VALUE;
        int minElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }
        return maxDiff;
    }
}
