package pl.sdacademy.java.advanced.exercises.day2.task12;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public boolean add(Car car) {
        return cars.add(car);
    }

    public boolean remove(Car car) {
        return cars.remove(car);
    }

    public List<Car> getAll() {
        //return cars; // zwraca referencję, będziemy operaować cały czas na cars
        //return List.copyOf(cars); // tworzy i zwraca niemodyfikowalną listę
        return new ArrayList<>(cars);
    }


}
