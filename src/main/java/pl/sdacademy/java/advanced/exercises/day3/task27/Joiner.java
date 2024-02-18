package pl.sdacademy.java.advanced.exercises.day3.task27;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner<T> {
    private final String delimiter;

    public Joiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public String join(T... parts) {
        return Stream.of(parts)
                //.map(part -> part.toString())
                .map(Object::toString)
                .collect(Collectors.joining(delimiter));
    }

//    public String dummy(int first, int... second) {
//        return null;
//    }
//
//    public String dummy2(double... second, String first) {
//        return null;
//    }
//
//    public String dummy3(String first, double... second, int... third) {
//        return null;
//    }
}
