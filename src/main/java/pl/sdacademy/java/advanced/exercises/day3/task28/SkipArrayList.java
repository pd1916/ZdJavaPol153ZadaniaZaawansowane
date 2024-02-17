package pl.sdacademy.java.advanced.exercises.day3.task28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement(int startIndex, int skip) {
        List<T> everyNthElement = new ArrayList<>();
        int currentIndex = startIndex;
        while(currentIndex < this.size()) {
            T element = this.get(currentIndex);
            everyNthElement.add(element);
            currentIndex += skip + 1;
        }
        return everyNthElement;
    }
}
