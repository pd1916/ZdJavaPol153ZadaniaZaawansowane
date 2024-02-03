package pl.sdacademy.java.advanced.exercises.day1.task1;

import java.util.*;

public class Task1 {
    private final static List<String> UNSORTED = List.of("A", "B", "Z", "D", "G", "C");

    public static void main(String[] args) {
        List<String> result1 = sortUsingComparator(UNSORTED);
        List<String> result2 = sortUsingOwnComparator(UNSORTED);
        result2.forEach(System.out::println);
    }

    private static List<String> sortUsingComparator(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*
                A.compareTo(B)
                0 -> gdy A i B są takie same
                -1 -> gdy A < B
                +1 -> gdy A > B
                o1.compareTo(o2); // A -> Z, porządek naturalny
                o2.compareTo(o1); // Z -> A
                -o1.compareTo(o2); // Z -> A
                */
                return o2.compareTo(o1);
            }
        });
        return sorted;
    }

    private static List<String> sortUsingOwnComparator(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }

    private static List<String> sortUsingExisitingComparator(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        //Collections.sort(sorted,(s1, s2) -> s2.compareTo(s1));
        Collections.sort(sorted, Comparator.reverseOrder());
        return sorted;
    }

    private static List<String> sortUsingStream(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    private static List<String> sortUsingList(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(Comparator.reverseOrder());
        return sorted;
    }


}
