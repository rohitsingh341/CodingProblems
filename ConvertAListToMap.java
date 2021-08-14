package CodingExercises;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertAListToMap {
    public static void main(String[] args) {

        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.add(new Notes(6, "note4", 66));

        Map<String, Long> notesMap = noteLst.stream()
                //.sorted(Comparator.comparingLong(Notes::getTagId)) // sorting based on provided comparator
                .sorted(Comparator.comparingLong(Notes::getTagId).reversed()) // sorting based on provided comparator in REVERSE order
                .collect(Collectors.toMap(Notes::getTagName, //  mapping function to generate keys of a new map
                        Notes::getTagId,                    //  mapping function to generate values of a new map
                        (oldValue, newValue) -> oldValue, // Merge function to resolve conflicts -
                                                            // if you want old value you can use it in Lambda Expression Body
                                                            // Else new value in Lambda Expression Body
                        LinkedHashMap::new)
                );

        System.out.println("Notes" + notesMap);
    }
}


class Notes {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    private int id;
    private String tagName;
    private long tagId;

    public Notes(int id, String tagName, long tagId) {
        this.id = id;
        this.tagName = tagName;
        this.tagId = tagId;
    }
}