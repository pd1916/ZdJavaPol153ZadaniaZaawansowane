package pl.sdacademy.java.advanced.exercises.day3.task27;

public class Child {
    private final String name;
    private final int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
