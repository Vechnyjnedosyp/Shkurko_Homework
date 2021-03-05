package eu.senla.task5.deck;

import eu.senla.task5.containers.Barrel;
import eu.senla.task5.containers.Box;
import eu.senla.task5.containers.Cone;
import eu.senla.task5.main.IBasically;
import eu.senla.task5.containers.AbstractContainer;

import java.util.Arrays;
import static java.lang.Math.random;

public class Deck extends Object implements IBasically {

    private AbstractContainer [] containers; // объявляю массив контейнеров
    private int sizeofContainers;
    private int count = 0;
    private double allMassWaterDeck;
    private boolean isAutocomplete;

    public Deck() {
    }

    public Deck(int sizeOfContainers) { // задаю входной параметр ввиде размера контейнеров
        this.sizeofContainers = sizeOfContainers;
        boolean isOneDeckSize = sizeOfContainers == 1; // если контейнеры маленькие
        if (isOneDeckSize){
           this.containers = new AbstractContainer[4]; // то размер массива равен 4
        } else {
            this.containers = new AbstractContainer[2]; // если - нет, то 2
        }
    }

    public Deck(int sizeofContainers, boolean isAutocomplete) {
        this(sizeofContainers);
        this.isAutocomplete = isAutocomplete;
        if(this.isAutocomplete) {
            addAuto();
        }
    }

    @Override
    public void add(Object object) {
        if (count < containers.length && !isAutocomplete) {
            containers[count] = (AbstractContainer) object;
            allMassWaterDeck += containers[count].getMassOfWater();
            count++;
        }
    }

    @Override
    public void remove() {
        if (count >= 0){
            count--;
            allMassWaterDeck -= containers[count].removeMassOfWater();
            containers[count] = null;
        }
    }

    public void addAuto() {
        for (int i = 0; i < containers.length; i++){ // цикл автоматически заполняет массив
            int from = 1;
            int to = 3;
            int typeContainer = from + (int)(random()*((to - from) + 1)); // рандомно выбирается тип контейнера
            switch (typeContainer) {
                case 1:
                    containers[i] = new Barrel(sizeofContainers); // исходя из размера первого контейнера
                    break;
                case 2:
                    containers[i] = new Cone(sizeofContainers);   // создаются либо 4 маленьких
                    break;
                case 3:
                    containers[i] = new Box(sizeofContainers);    // либо 2 больших
                    break;
            }
            allMassWaterDeck += containers[i].getMassOfWater(); // и в конце считает общую сумму массы воды на палубе
        }
    }

    public double getAllMassWaterDeck() {
        return allMassWaterDeck;
    }

    @Override
    public String toString() {
        return String.format ("Deck{ containers = '%s', allMassWaterDeck = %.2f } ",
                Arrays.toString(containers), getAllMassWaterDeck());
    }



}