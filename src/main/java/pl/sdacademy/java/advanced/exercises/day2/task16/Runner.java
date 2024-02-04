package pl.sdacademy.java.advanced.exercises.day2.task16;

import java.util.Arrays;

public enum Runner {
    BEGINNER(513, Integer.MAX_VALUE),
    INTERMEDIATE(257,512),
    ADVANCED(0,256);

    private static final Runner[] VALUES = values();
    private final int minMinutes;
    private final int maxMinutes;

    Runner(int minMinutes, int maxMinutes) {
        this.minMinutes = minMinutes;
        this.maxMinutes = maxMinutes;
    }

    // runningTimeInMinutes=300
    public static Runner getFitnessLevel(int runningTimeInMinutes) {
        return Arrays.stream(VALUES)
                .filter(runner -> runningTimeInMinutes <= runner.maxMinutes && runningTimeInMinutes >= runner.minMinutes)
                .findFirst()
                .orElse(BEGINNER);
                //.orElseThrow(() -> new IllegalArgumentException("Podany czas jest spoza możliwych zakresów czasu: " + runningTimeInMinutes));
    }
}
