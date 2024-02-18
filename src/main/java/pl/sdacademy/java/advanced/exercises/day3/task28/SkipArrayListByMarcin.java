package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SkipArrayListByMarcin<T> extends ArrayList<T> {
    private List<T> list;

    public SkipArrayListByMarcin(List<T> list) {

        this.list = list;
    }

    public List<T> getEveryNthElement(int startIndex, int skip) {
        return IntStream.range(0, list.size())
                .filter(getIntPredicate(startIndex, skip))
                .mapToObj(list::get)
                .collect(Collectors.toList());
    }

    private static IntPredicate getIntPredicate(int startIndex, int skip) {
        return i -> i == startIndex || i == startIndex + skip;
    }
}