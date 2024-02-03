package pl.sdacademy.java.advanced.exercises.day1.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private final Map<String, List<String>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        if(storage.containsKey(key)) {
            // dodaj/zmodyfikuj nową wartości do value, czyli do listy
            storage.get(key).add(value);
        } else {
            // dodaj nowy klucz, z daną wartością
            List<String> elements = new ArrayList<>();
            elements.add(value);
            storage.put(key, elements);
        }
    }

    public void printValues(String key) {
        System.out.println(storage.get(key));
    }

    public List<String> findKeysByValue(String searchedValue) {
        return storage.entrySet().stream()
                .filter(entry -> entry.getValue().contains(searchedValue))
                //.map(entry -> entry.getKey())
                .map(Map.Entry::getKey)
                .toList();
    }
}
