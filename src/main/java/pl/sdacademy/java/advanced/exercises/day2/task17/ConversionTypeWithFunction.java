package pl.sdacademy.java.advanced.exercises.day2.task17;

import java.util.function.Function;

public enum ConversionTypeWithFunction {
    METERS_TO_YARDS(value -> value * 1.0936133),
    YARDS_TO_METERS(value -> value / 1.0936133),
    CENTIMETERS_TO_INCHES(value -> value / 2.54),
    INCHES_TO_CENTIMETERS(value -> value * 2.54),
    KILOMETERS_TO_MILES(value -> value * 0.6213712),
    MILES_TO_KILOMETERS(value -> value / 0.6213712);

    private final Function<Double, Double> conversionFunction;

    ConversionTypeWithFunction(Function<Double, Double> conversionFunction) {
        this.conversionFunction = conversionFunction;
    }

    public Function<Double, Double> getConversionFunction() {
        return conversionFunction;
    }
}
