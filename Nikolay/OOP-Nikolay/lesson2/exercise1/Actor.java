package Nikolay.OOP-Nikolay.lesson2.exercise1;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }

    abstract String getName();
}
