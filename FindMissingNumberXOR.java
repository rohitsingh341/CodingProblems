package DynamicProgramming;

public class FindMissingNumberXOR {
    public static void main(String[] args) {
       int nums[] = {1,2,3,4,6,7,8,9};

       int x1 = nums[0]; // Defaulting with first item
       int x2 = 1;

       // First take the XOR with all the array elements in x1
       for (int i = 1; i < nums.length; i++) {
           x1 = x1 ^ nums[i];
           System.out.println("x1 : " + x1);
       }

       // Second take the XOR with all the numbers from 1 to n in x2.
       for (int i = 2; i <= nums.length +1; i++) {
           x2 = x2 ^ i;
           System.out.println("x2 : " + x2);
       }

        System.out.println(x1 ^ x2);
    }
}
