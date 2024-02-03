package pl.sdacademy.java.advanced.exercises.day1.task7;

public class Task7 {

    public static void main(String[] args) {
        WeaponClip weaponClip = new WeaponClip(5);
        weaponClip.loadBullet("hello_1");
        weaponClip.loadBullet("hello_2");
        weaponClip.loadBullet("hello_3");
        weaponClip.loadBullet("hello_4");
        weaponClip.loadBullet("hello_5");
        // weaponClip.loadBullet("hello_6"); // ex: clip is full

        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
        System.out.println(weaponClip.shot());
    }
}
