package eu.senla.task5.port;

import eu.senla.task5.main.IBasically;
import eu.senla.task5.ships.Ship;

import java.util.Arrays;

public class Port extends Object implements IBasically {

    private Ship[] ships;
    private int count = 0;
    private double allMassOfWaterInPort;

    public Port() {
        this.ships = new Ship[10];
    }

    @Override
    public void add(Object object) {
        if (count < ships.length){
            ships[count] = (Ship) object;
            allMassOfWaterInPort += ships[count].getAllMassWaterInShip();
            count++;
        }
    }

    @Override
    public void remove() {
        if (count > 0) {
            count--;
            allMassOfWaterInPort += ships[count].getAllMassWaterInShip();
            ships[count] = null;
        }
    }

    public double getAllMassOfWaterInPort() {
        return allMassOfWaterInPort;
    }

    @Override
    public String toString() {
        return String.format ("Port{ ships= '%s', allMassWaterInShip = %.2f }", Arrays.toString(ships), getAllMassOfWaterInPort());
    }
}
