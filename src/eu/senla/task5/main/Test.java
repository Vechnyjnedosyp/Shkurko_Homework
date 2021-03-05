package eu.senla.task5.main;

import eu.senla.task5.containers.AbstractContainer;
import eu.senla.task5.containers.Barrel;
import eu.senla.task5.containers.Box;
import eu.senla.task5.containers.Cone;
import eu.senla.task5.deck.Deck;
import eu.senla.task5.port.Port;
import eu.senla.task5.ships.Ship;


public class Test {

    public static void main(String[] args) {

        Deck deck = new Deck(1, false); // создаем палубу, выбираем тип палубы
        AbstractContainer container1 = new Barrel(1); // создаем 4 контейнера
        AbstractContainer container2 = new Cone(1);
        AbstractContainer container3 = new Box(1);
        AbstractContainer container4 = new Barrel(1);
        //System.out.println(container.massOfWater());
        deck.add(container1);
        deck.add(container2);
        deck.add(container3);
        deck.add(container4);
        //System.out.println("1 " + deck);
//        deck.remove();
//        System.out.println(deck);
//        deck.remove();
//        System.out.println(deck);
//        deck.remove();
//        System.out.println(deck);
//        deck.remove();
        Deck deck1 = new Deck(1,true);
        //System.out.println("2 " + deck1);
        Ship ship = new Ship(2);
        ship.add(deck);
        ship.add(deck1);
        //System.out.println(ship);
        ship.remove();
        //System.out.println(ship);
        Port port = new Port();

        Deck deck2 = new Deck(2,true);
        Deck deck3 = new Deck(1,true);
        Deck deck4 = new Deck(1,true);
        Deck deck5 = new Deck(2,true);
        Deck deck6 = new Deck(1,true);
        Deck deck7 = new Deck(2,true);
        Deck deck8 = new Deck(2,true);
        Deck deck9 = new Deck(1,true);
        Deck deck10 = new Deck(2,true);

        Ship ship1 = new Ship(1);
        ship1.add(deck2);
        Ship ship2 = new Ship(2);
        ship2.add(deck3);
        ship2.add(deck4);
        Ship ship3 = new Ship(1);
        ship3.add(deck5);
        Ship ship4 = new Ship(2);
        ship4.add(deck6);
        ship4.add(deck7);
        Ship ship5 = new Ship(1);
        ship5.add(deck8);
        Ship ship6 = new Ship(2);
        ship6.add(deck9);
        ship6.add(deck10);

        port.add(ship);
        port.add(ship1);
        port.add(ship2);
        port.add(ship3);
        port.add(ship4);
        port.add(ship5);
        port.add(ship6);
        System.out.println(port);

        port.remove();
        port.remove();
        System.out.println(port);





    }
}
