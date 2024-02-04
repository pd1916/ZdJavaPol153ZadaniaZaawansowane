package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.*;
import java.util.stream.Collectors;

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

    public Optional<Car> getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice));
    }

    public List<Car> getCarsHavingAtLeast2Manufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 2)
                .collect(Collectors.toList());
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

    public boolean contains(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsProducedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsFoundedInAndProducedBy(int foundedYear, Operation operation) {
        switch(operation) {
            case GREATER_THAN:
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(m -> m.getFoundedYear() > foundedYear))
                        .collect(Collectors.toList());
            case LESS_THAN:
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(m -> m.getFoundedYear() < foundedYear))
                        .collect(Collectors.toList());
            case EQUAL:
                return cars.stream()
                        .filter(car -> car.getManufacturers().stream()
                                .anyMatch(m -> m.getFoundedYear() == foundedYear))
                        .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }


}
