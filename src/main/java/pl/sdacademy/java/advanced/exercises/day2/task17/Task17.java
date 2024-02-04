package pl.sdacademy.java.advanced.exercises.day2.task17;

public class Task17 {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();
        double result = converter.convert(2.54, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(result);

        result = converter.convert(55, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(result);

        result = converter.convert(2.54, ConversionTypeWithFunction.CENTIMETERS_TO_INCHES);
        System.out.println(result);

        result = converter.convert(55, ConversionTypeWithFunction.KILOMETERS_TO_MILES);
        System.out.println(result);
    }
}
