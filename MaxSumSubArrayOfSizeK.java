public class MaxSumSubArrayOfSizeK {
    public static void main(String[] args) {

        System.out.println("max sum: " + maxSum(3, new int[] { 2, 1, 5, 1, 3, 2 }));
        System.out.println("max sum: " + maxSum(2, new int[] { 2, 3, 4, 1, 5 }));
    }

    private static int maxSum(int k, int[] arr) {
        int windowStart = 0;
        int windowSum = 0;
        int maxSum = 0;
        for (int windowEnd = 0; windowEnd <  arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
