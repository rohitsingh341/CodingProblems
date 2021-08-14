public class MinLengthSubArraySum {
    public static void main(String[] args) {
        System.out.println( "Min length sub Array : " + minLengthSubArrSum(7, new int[] {2,1,5,2,3,2}));
    }

    private static int minLengthSubArrSum(int sum, int[] arr) {
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];// add the next element

            // shrink the window as small as possible until the 'windowSum' is smaller than 'sum'
            while (windowSum >= sum) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}
