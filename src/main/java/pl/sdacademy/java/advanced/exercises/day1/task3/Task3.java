package pl.sdacademy.java.advanced.exercises.day1.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> input  = new LinkedHashMap<>();
        input.put("Java", 18);
        input.put("Python", 1);
        input.put("C#", 15);
        input.put("JavaScript", 7);
        input.put("Scala", 22);
        input.put("PHP", 0);
        printWithStream(input);
    }

    private static void print(Map<String, Integer> input) {
        int counter = 0;
        for(Map.Entry<String, Integer> element : input.entrySet()) {
            counter++;
            if(counter == input.size()) {
                System.out.println("Klucz: " + element.getKey() + ", Wartość: " + element.getValue() + ".");
            } else {
                System.out.println("Klucz: " + element.getKey() + ", Wartość: " + element.getValue() + ",");
            }
        }
    }

    private static void printWithStream(Map<String, Integer> input) {
        String result = input.entrySet().stream()
                .map(element -> "Klucz: " + element.getKey() + ", Wartość: " + element.getValue())
                .collect(Collectors.joining("," + System.lineSeparator(), "", "."));
        //.toList();
        System.out.println(result);
    }
}
