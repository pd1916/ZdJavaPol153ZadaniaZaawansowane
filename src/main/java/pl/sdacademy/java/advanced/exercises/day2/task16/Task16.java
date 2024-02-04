package pl.sdacademy.java.advanced.exercises.day2.task16;

public class Task16 {
    public static void main(String[] args) {
        Runner fitnessLevel = Runner.getFitnessLevel(-100);
        System.out.println(fitnessLevel); //BEGINNER

        fitnessLevel = Runner.getFitnessLevel(256);
        System.out.println(fitnessLevel); //ADVANCED

        fitnessLevel = Runner.getFitnessLevel(257);
        System.out.println(fitnessLevel); //INTERMEDIATE

        fitnessLevel = Runner.getFitnessLevel(512);
        System.out.println(fitnessLevel); //INTERMEDIATE

        fitnessLevel = Runner.getFitnessLevel(513);
        System.out.println(fitnessLevel); //BEGINNER

        fitnessLevel = Runner.getFitnessLevel(1000);
        System.out.println(fitnessLevel); //BEGINNER
    }
}
