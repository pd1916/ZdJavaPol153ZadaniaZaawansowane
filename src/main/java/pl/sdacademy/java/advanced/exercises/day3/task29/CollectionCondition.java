package pl.sdacademy.java.advanced.exercises.day3.task29;

import java.util.Collection;
import java.util.function.Predicate;

//public class CollectionCondition {
//public <T> double partOf(Collection<T> collection, Predicate<T> predicate) {
public class CollectionCondition<T> {
    public double partOf(Collection<T> collection, Predicate<T> predicate) {
        long count = collection.stream()
                .filter(predicate)
                .count();
        return 100.0 * count / collection.size();
    }
}
