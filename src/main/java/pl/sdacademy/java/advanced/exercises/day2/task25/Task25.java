package pl.sdacademy.java.advanced.exercises.day2.task25;

public class Task25 {
    //public static void main(String[] args) throws BasketFullExceptionChecked, BasketEmptyExceptionChecked{
    public static void main(String[] args) {
        BasketChecked basketChecked = new BasketChecked();

        try {
            basketChecked.addToBasket();
            basketChecked.addToBasket();
            basketChecked.addToBasket();
            basketChecked.addToBasket();
            basketChecked.addToBasket();
            basketChecked.addToBasket();
            basketChecked.addToBasket();
            basketChecked.addToBasket();
            basketChecked.addToBasket();
            basketChecked.addToBasket();
            basketChecked.addToBasket();
        } catch(BasketFullExceptionChecked ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        try {
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
            basketChecked.removeFromBasket();
        } catch(BasketEmptyExceptionChecked ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
