package CodingExercises;

public class LongestCommonString2 {

    public static void main(String[] args) {

        String s1 = "javarohitdev";
        String s2 = "devrohitjhansi";

        int[][] dp = new int[2][s2.length()+1];
        int maxLength = 0;
        int longestStrEndIndex = 0;
        for(int i=1; i <= s1.length(); i++) {
            for(int j=1; j <= s2.length(); j++) {
                dp[i%2][j] = 0;
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i%2][j] = 1 + dp[(i-1)%2][j-1];
                    if (dp[i%2][j] > maxLength) {
                        maxLength = dp[i%2][j];
                        // Keep a note of an index whenever we are setting maxLength variable.
                        // It will help us to get the substring of longest common string out of main string.
                        longestStrEndIndex = j;
                    }
                }
            }
        }
        System.out.println(maxLength);
        System.out.println("Longest common string: " + s2.substring(longestStrEndIndex - maxLength, longestStrEndIndex));
    }
}
