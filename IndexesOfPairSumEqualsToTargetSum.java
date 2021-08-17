import java.util.Arrays;

public class IndexesOfPairSumEqualsToTargetSum {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5,6,7,8,9};
        int targetSum = 12;
        System.out.println(Arrays.toString(getIndexesOfPairSumEqualsToTargetSum(arr, targetSum)));
    }

    private static int[] getIndexesOfPairSumEqualsToTargetSum(int[] arr, int targetSum) {
        int leftPointer = 0 ;
        int rightPointer = arr.length - 1;

        while (leftPointer < rightPointer) {
            int sum = arr[leftPointer] + arr[rightPointer];
            if (sum == targetSum) {
                return new int[] {leftPointer, rightPointer};
            }

            if (targetSum > sum) {
                leftPointer++;
            }
            else {
                rightPointer--;
            }
        }
        return new int[] {-1, -1};
    }
}
