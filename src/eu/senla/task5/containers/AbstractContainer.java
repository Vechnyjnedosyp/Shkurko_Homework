package eu.senla.task5.containers;

import static java.lang.Math.*;

public abstract class AbstractContainer implements Containable { // имплементируем методы интерфейса, которые также
                                                                // могут наследовать его дочерние классы
    private int sizeOfContainer;      // поля класса или его сущность
    private boolean isBigContainer;         // наследуемые свойства
    protected double volume;
    protected double mass;
    protected final int DENSITY_OF_WATER = getRandomDensityOfWater();

    public AbstractContainer() {
    }

    public AbstractContainer(int sizeOfContainer) {
        this.sizeOfContainer = sizeOfContainer;
    }

    public int isBigContainer() { // определяем размер контейнера и возвращаем его значение
        isBigContainer = sizeOfContainer == 2;
        return sizeOfContainer;
    }

    public int getSizeOfDiameter() { // исходя из значения переменной РазмераКонтейнера, метод возвращает
       if (isBigContainer){         // размер диагонали или диаметра
           return 20;
       } else {
           return 10;
       }
    }

    protected int getRandomHigh() { // данный метод определяет размер высоты контейнера рандомным образом в диапазоне
        int from = 10;
        int to = 100;
        return from + (int)(random()*((to - from) + 1));
    }

    protected int getRandomDensityOfWater() { // возвращает размер плотности воды 1000 или 2000
        int from = 1;
        int to = 2;
        int density =  from + (int)(random()*((to - from) + 1));
        switch(density) {
            case 1:
                density = 1000;
                break;
            case 2:
                density = 2000;
                break;
        }
        return density;
    }

}
