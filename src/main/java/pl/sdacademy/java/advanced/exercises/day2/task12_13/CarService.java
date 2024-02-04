package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.ArrayList;
import java.util.Comparator;
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

    public List<Car> getCarsProducedBefore1999() {
        return cars.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .toList();
    }

    public Car getCheapestCar() {
        return cars.stream()
                //.min(Comparator.comparingDouble(car -> car.getPrice()))
                .min(Comparator.comparingDouble(Car::getPrice))
                //.orElseThrow(() -> new IllegalArgumentException());
                .orElseThrow(IllegalArgumentException::new);
    }

    public List<Car> getCarsSortedByName(boolean ascending) {
        if(ascending) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .toList();
        }
        return cars.stream()
                .sorted(Comparator.comparing(Car::getName).reversed())
                .toList();
    }


}
