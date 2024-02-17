package pl.sdacademy.java.advanced.exercises.day3.task32;

import java.io.*;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Task32 {

    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercises/day3/task32");
        Path file = dirPath.resolve("cars.txt");

        // tworzymy liste samochodów do zapisu
        List<Car> cars = List.of(
          new Car("Volvo XC90", 400_000, true),
          new Car("BMW", 100_000, false),
          new Car("BMW", 500_000, true)
        );

        //zapis do pliku
        saveFileContent(file, cars);

        //odczyt z pliku
        List<Car> result = readFileContent(file);
        System.out.println(result);
    }

    private static List<Car> readFileContent(Path filepath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath.toFile()))){
            return (List<Car>) ois.readObject();
        } catch(IOException | ClassNotFoundException e) {
            System.out.println("Exception: " + e);
        }
        return Collections.emptyList();
    }

    private static boolean saveFileContent(Path filepath, List<Car> content) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath.toFile()))){
            oos.writeObject(content);
            return true;
        } catch(IOException e) {
            System.out.println("Exception during I/O: " + e);
        }
        return false;
    }
}
