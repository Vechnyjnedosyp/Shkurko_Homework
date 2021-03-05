package eu.senla.task5.containers;

public class Barrel extends AbstractContainer {

    public Barrel(int sizeOfContainer) { // контейнер класса, принимает значение размера контейнера
        super(sizeOfContainer);         // и инициализирует все методы в порядке очереди из класса parent
    }

    @Override
    public double getContainerVolume() { // метод интерфейса, который переопределен и возвращает объем контейнера
        volume = PI * Math.pow(getSizeOfDiameter()/2, 2) * getRandomHigh();
        return volume;
    }

    @Override
    public double getMassOfWater() { // метод интерфейса, который переопределен и массу воды в контейнере
        mass = DENSITY_OF_WATER * getContainerVolume();
        return mass;
    }

    @Override
    public double removeMassOfWater() {
        return this.mass;
    }

    @Override
    public String toString() {
        return String.format ("Barrel{ mass = %.2f }", mass);
    }
}