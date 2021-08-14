
import java.util.*;
import java.util.stream.Collectors;

public class ArrayListSorting {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(20);
        integerList.add(34);
        integerList.add(87);
        integerList.add(13);

        System.out.println("List before sorting (using collections.sort): " + integerList);
        Collections.sort(integerList);
        System.out.println("List after sorting: " + integerList);

        List<Integer> newIntList = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorting in Java 8 way: " + newIntList);

    }

}
