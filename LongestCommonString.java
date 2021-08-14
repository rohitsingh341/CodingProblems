package CodingExercises;

public class LongestCommonString {

    public static void main(String[] args) {

        String str1 = "javarohitdev";
        String str2 = "devrohitjhansi";

        // a two-d array to hold the count of longest common string.
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        int maxLength = 0;
        int longestStrEndIndex = 0;
        for(int i=1; i <= str1.length(); i++) {
            for(int j=1; j <= str2.length(); j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        // Keep a note of an index whenever we are setting maxLength variable.
                        // It will help us to get the substring of longest common string out of main string.
                        longestStrEndIndex = j;
                    }
//                    System.out.println("i: " + i + ", j: " + j + ", max: " + maxLength + ", dp[i][j]: " + dp[i][j] + ", longestStrEndIndex: " + longestStrEndIndex);
                }
            }
        }
        System.out.println("Longest common string: " + str2.substring(longestStrEndIndex - maxLength, longestStrEndIndex));
    }
}
