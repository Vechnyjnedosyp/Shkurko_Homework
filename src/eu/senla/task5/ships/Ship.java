package eu.senla.task5.ships;

import eu.senla.task5.main.IBasically;
import eu.senla.task5.deck.Deck;

public class Ship extends Object implements IBasically {

    private Deck[] decks; //объявляю массив палуб
    private int count = 0;
    private double allMassWaterInShip;

    public Ship() {
    }

    public Ship(int typeOfDeck) {
        this.decks = new Deck[typeOfDeck];
    }

    @Override
    public void add(Object object) {
        if(count < decks.length){
            decks[count] = (Deck) object;
            allMassWaterInShip += decks[count].getAllMassWaterDeck();
            count++;
        }
    }

    public void remove() {
        if (count > 0){
            count--;
            allMassWaterInShip -= decks[count].getAllMassWaterDeck();
            decks[count] = null;
        }

    }

    public double getAllMassWaterInShip() {
        return allMassWaterInShip;
    }

    @Override
    public String toString() {
        //return String.format ("Ship{ decks= '%s', allMassWaterInShip = %.2f }", Arrays.toString(decks), allMassWaterInShip);
        return String.format ("Ship{ allMassWaterInShip = %.2f }", allMassWaterInShip);
    }

}
