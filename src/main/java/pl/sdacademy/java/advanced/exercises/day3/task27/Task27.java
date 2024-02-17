package pl.sdacademy.java.advanced.exercises.day3.task27;

public class Task27 {
    public static void main(String... args) {
        Joiner<String> joiner = new Joiner<>("-");
        String result = joiner.join("a", "b", "c", "d");
        System.out.println(result);

        Joiner<Integer> joiner2 = new Joiner<>("|");
        String result2 = joiner2.join(1, 2, 3, 4);
        System.out.println(result2);

        Joiner joiner3 = new Joiner("*");
        String result3 = joiner3.join("a", 1, 2.0);
        System.out.println(result3);

        Joiner<Child> joiner4 = new Joiner<Child>("!");
        String result4 = joiner4.join(new Child("Ala", 4), new Child("Ola", 6));
        System.out.println(result4);
    }
}
