package pl.sdacademy.java.advanced.exercises.day2.task25;

public class BasketChecked {
    private int numberOfElements;

    public BasketChecked() {
        this.numberOfElements = 0;
    }

    public void addToBasket() throws BasketFullExceptionChecked {
        if(numberOfElements == 10) {
            //rzuć wyjątek
            throw new BasketFullExceptionChecked("Too many items in the basket");
        }
        numberOfElements++;
    }

    public void removeFromBasket() throws BasketEmptyExceptionChecked {
        if(numberOfElements == 0) {
            //rzuć wyjątek
            throw new BasketEmptyExceptionChecked("Can't remove from empty basket");
        }
        numberOfElements--;
    }
}
