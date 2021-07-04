package DynamicProgramming;

import java.util.List;

public class FindMissingNumber {

    public static int missingNumber(int[] nums) {
        int totalItems = nums.length + 1; // because after including the missing number total items would +1
        int sum = totalItems * (totalItems + 1)/2;
        for (int n : nums) {
            sum -= n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        System.out.println(missingNumber(a));
    }
}
