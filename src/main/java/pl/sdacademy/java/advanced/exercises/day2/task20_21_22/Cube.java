package pl.sdacademy.java.advanced.exercises.day2.task20_21_22;

public class Cube extends Shape3D implements Fillable {
    private final int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    double calculateVolume() {
        return Math.pow(a, 3);
    }

    @Override
    int calculatePerimeter() {
        return 12 * a;
    }

    /**
     * opsiać co metoda robi
     *
     * @param volume - czym jest ten param
     * @return 0 -> oznacza, że figura jest napełniona po brzegi
     * +1 -> oznacza, że wody jest zbyt dużo
     * -1 -> oznacza, że wody jest zbyt mało
     */
    @Override
    public int fill(double volume) {
        double maxVolume = calculateVolume();
        if(maxVolume == volume) {
            return 0;
        } else if(maxVolume > volume) {
            return -1;
        }
        return 1;
    }
}
