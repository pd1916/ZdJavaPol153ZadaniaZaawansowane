package pl.sdacademy.java.advanced.exercises.day2.task12_13;

import java.util.List;

public class Task12_13 {
    public static void main(String[] args) {
//        Manufacturer volvo = new Manufacturer("Volvo", 1900, "Sweden");
//        Car xc90 = new Car("Volvo", "XC90", 400_000, 2023, List.of(volvo), EngineType.V12);
//        Car xc60 = new Car("Volvo", "XC60", 200_000, 2022, List.of(volvo), EngineType.V8);
//        Car xc40 = new Car("Volvo", "XC40", 150_000, 2021, List.of(volvo), EngineType.V6);
//
//        // główna wypożyczalnia
//        CarService mainCarRental = new CarService();
//        mainCarRental.add(xc90);
//        mainCarRental.add(xc60);
//        //mainCarRental.remove(xc90);
//
//        //klient_1
//        List<Car> carRental_1 = mainCarRental.getAll();
//        carRental_1.add(xc40);
//        carRental_1.remove(xc90);

        CarService carService = new CarService();
        // #Manufacturers
        Manufacturer volvo = new Manufacturer("Volvo", 1930, "Sweden");
        Manufacturer benz = new Manufacturer("Benz", 1883, "Germany");
        Manufacturer mercedes = new Manufacturer("Mercedes", 1901, "Germany");
        Manufacturer fiat = new Manufacturer("Fiat", 1899, "Italy");
        Manufacturer porshe = new Manufacturer("Porshe", 1931, "Germany");

        // #Cars
        Car xc90 = new Car("XC90", "XC90", 400_000, 2023, List.of(volvo), EngineType.V8);
        Car xc60 = new Car("XC60", "XC60", 200_000, 2022, List.of(volvo), EngineType.V6);
        Car x500 = new Car("x500", "x500", 100_000, 2020, List.of(fiat), EngineType.S4);
        Car gls1 = new Car("GLS_1", "GLS", 500_000, 2021, List.of(mercedes, benz), EngineType.V12);
        Car gls2 = new Car("GLS_2", "GLS", 700_000, 2023, List.of(mercedes, benz), EngineType.V12);
        Car cayenne = new Car("Cayenne", "Cayenne", 450_000, 2022, List.of(porshe), EngineType.S6);
        Car multipla = new Car("Multipla", "Multipla", 1, 1995, List.of(fiat), EngineType.S3);

        carService.add(xc90);
        carService.add(xc60);
        carService.add(x500);
        carService.add(gls1);
        carService.add(gls2);
        carService.add(cayenne);
        carService.add(multipla);

        System.out.println("getCarsProducedBefore1999: " + carService.getCarsProducedBefore1999());
        System.out.println("getCheapestCar: " + carService.getCheapestCar());
        System.out.println("ascending: " + carService.getCarsSortedByName(true));
        System.out.println("descending: " + carService.getCarsSortedByName(false));

    }
}
