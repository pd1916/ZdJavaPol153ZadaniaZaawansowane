package pl.sdacademy.java.advanced.exercises.day1.task7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class WeaponClip {
    //private final Deque<String> bullets = new ArrayDeque<>();
    private final Stack<String> bullets = new Stack<>();
    private final int maxNumberOfBulletsInClip;

    public WeaponClip(int capacity) {
        maxNumberOfBulletsInClip = capacity;
    }

    public void loadBullet(String bullet) {
        if(bullets.size() == maxNumberOfBulletsInClip) {
            throw new IllegalArgumentException("Clip is full");
            //return false;
        }
        bullets.push(bullet);
        //return true;
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
    }

    public String shot() {
        if(isLoaded()) {
            //wystrzel nabój
            return bullets.pop();
        }
        //zwróć komunikat o błędzie
        return "Clip is empty";
    }

}
