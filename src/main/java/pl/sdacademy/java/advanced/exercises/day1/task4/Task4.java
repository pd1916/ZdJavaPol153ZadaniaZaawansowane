package pl.sdacademy.java.advanced.exercises.day1.task4;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("artykuły spożywcze", "mleko");
        storage.addToStorage("artykuły spożywcze", "cukier");
        storage.addToStorage("samochody", "fiat");
        storage.addToStorage("samochody", "volvo");
        storage.addToStorage("samochody", "mercedes");
        storage.addToStorage("różne", "mleko");
        storage.addToStorage("różne", "volvo");

        storage.printValues("artykuły spożywcze");
        storage.printValues("samochody");
        storage.printValues("różne");

        List<String> volvo = storage.findKeysByValue("volvo");
        System.out.println(volvo);
    }
}
