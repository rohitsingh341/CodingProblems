package DynamicProgramming;

import static java.lang.Character.isWhitespace;

public class RemoveWhitespacesWithReadWritePointers {

    public static void main(String[] args) {
        String str = "Hello World";
        char[] chars = str.toCharArray();
        removeWhitespaces(chars);
        print(chars);

    }
    static void print(char[] s) {
        int i = 0;
        while (i < s.length && s[i] != '\0') {
            System.out.print(s[i]);
            ++i;
        }
        System.out.println();
    }

    private static void removeWhitespaces(char[] str) {

        int readPtr = 0;
        int writePtr = 0;

        while (readPtr < str.length) {
            if (!isWhitespace(str[readPtr])) {
                str[writePtr] = str[readPtr];
                ++writePtr;
            }
            ++readPtr;
        }
        str[writePtr] = '\0';
    }
}
