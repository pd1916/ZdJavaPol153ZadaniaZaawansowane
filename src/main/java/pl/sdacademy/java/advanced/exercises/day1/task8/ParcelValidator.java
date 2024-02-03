package pl.sdacademy.java.advanced.exercises.day1.task8;

public class ParcelValidator implements Validator {
    private static final int TOTAL_MAX_LENGTH = 300;
    private static final int SINGLE_MIN_LENGTH = 30;
    private static final int MAX_WEIGHT_FOR_EXPRESS = 15;
    private static final int MAX_WEIGHT_FOR_NOT_EXPRESS = 30;

    @Override
    public boolean validate(Parcel parcel) {
        return isXYZLessThan300(parcel) && isWeightIsCorrect(parcel) && isAllDimensionsAreMoreThan30(parcel);
    }

    private boolean isXYZLessThan300(Parcel parcel) {
        return parcel.getxLength() + parcel.getyLength() + parcel.getzLength() <= TOTAL_MAX_LENGTH;
    }

    private boolean isWeightIsCorrect(Parcel parcel) {
        return (!parcel.isExpress() && parcel.getWeight() <= MAX_WEIGHT_FOR_NOT_EXPRESS)
                || (parcel.isExpress() && parcel.getWeight() <= MAX_WEIGHT_FOR_EXPRESS);
    }

    private boolean isAllDimensionsAreMoreThan30(Parcel parcel) {
        return parcel.getxLength() >= SINGLE_MIN_LENGTH &&
                parcel.getyLength() >= SINGLE_MIN_LENGTH &&
                parcel.getzLength() >= SINGLE_MIN_LENGTH;
    }
}