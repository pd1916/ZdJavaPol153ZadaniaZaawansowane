package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.List;

public class Task28 {

    public static void main(String[] args) {
        SkipArrayList<String> skipArrayList = new SkipArrayList<>();
        skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));
        List<String> result1 = skipArrayList.getEveryNthElement(2, 3);
        System.out.println(result1); // c, g

        SkipArrayList<Integer> skipArrayList2 = new SkipArrayList<>();
        skipArrayList2.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        List<Integer> result2 = skipArrayList2.getEveryNthElement(2, 3);
        System.out.println(result2); // 3, 7, 11
    }
}
