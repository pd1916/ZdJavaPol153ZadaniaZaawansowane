package pl.sdacademy.java.advanced.exercises.day2.task24;

public class Basket {
    private int numberOfElements;

    public Basket() {
        this.numberOfElements = 0;
    }

    public void addToBasket() {
        if(numberOfElements == 10) {
            //rzuć wyjątek
            throw new BasketFullException("Too many items in the basket");
        }
        numberOfElements++;
    }

    public void removeFromBasket() {
        if(numberOfElements == 0) {
            //rzuć wyjątek
            throw new BasketEmptyException("Can't remove from empty basket");
        }
        numberOfElements--;
    }
}
