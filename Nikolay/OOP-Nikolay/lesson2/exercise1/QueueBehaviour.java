package Nikolay.OOP-Nikolay.lesson2.exercise1;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}
