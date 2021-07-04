package DynamicProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Rohit";

        char[] nameCharArray = name.toCharArray();

        name.chars().mapToObj(i -> (char)(i)).collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
            Collections.reverse(list);
            return list.stream();
        })).forEach(System.out::println);

    }

}
