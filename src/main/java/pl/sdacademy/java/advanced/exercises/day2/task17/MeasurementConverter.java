package pl.sdacademy.java.advanced.exercises.day2.task17;

public class MeasurementConverter {

    /*
    value = 2.54
    type = CENTIMETERS_TO_INCHES
    2.54 * CENTIMETERS_TO_INCHES(jego przelicznik)
    2.54 * 0.39 = 1
     */
    public double convert(double value, ConversionType conversionType) {
        return value * conversionType.getValue();
    }

    public double convert(double value, ConversionTypeWithFunction conversionType) {
        return conversionType.getConversionFunction().apply(value);
    }
}
