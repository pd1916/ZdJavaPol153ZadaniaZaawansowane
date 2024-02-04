package pl.sdacademy.java.advanced.exercises.day2.task12;

import java.util.List;

public class Task12_13 {
    public static void main(String[] args) {
        Manufacturer volvo = new Manufacturer("Volvo", 1900, "Sweden");
        Car xc90 = new Car("Volvo", "XC90", 400_000, 2023, List.of(volvo), EngineType.V12);
        Car xc60 = new Car("Volvo", "XC60", 200_000, 2022, List.of(volvo), EngineType.V8);
        Car xc40 = new Car("Volvo", "XC40", 150_000, 2021, List.of(volvo), EngineType.V6);

        // główna wypożyczalnia
        CarService mainCarRental = new CarService();
        mainCarRental.add(xc90);
        mainCarRental.add(xc60);
        //mainCarRental.remove(xc90);

        //klient_1
        List<Car> carRental_1 = mainCarRental.getAll();
        carRental_1.add(xc40);
        carRental_1.remove(xc90);

        System.out.println();
    }
}
