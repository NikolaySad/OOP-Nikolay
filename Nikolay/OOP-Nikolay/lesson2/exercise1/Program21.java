/*
 * Реализовать класс Market и все методы, которые он обязан реализовывать.
 * Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
 * MarketBehaviour – помещает и удаляет человека из очереди, 
 * метод update – обновляет состояние магазина (принимает и отдаёт заказы)
 */
package Nikolay.OOP-Nikolay.lesson2.exercise1;

public class Program21 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Market myMarket = new Market();
        System.out.println();
        myMarket.acceptToMarket(new Human("Владимир"));

        myMarket.update();

        myMarket.acceptToMarket(new Human("Игорь"));
        myMarket.acceptToMarket(new Human("Юрий"));

        myMarket.update();

    }
}
