package eu.senla.task5.containers;

public class Box extends AbstractContainer {

    public Box(int sizeOfContainer) {
        super(sizeOfContainer);
    }

    @Override
    public double getContainerVolume() {
        volume = (Math.pow(getSizeOfDiameter(), 2)/2) * getRandomHigh();
        return volume;
    }

    @Override
    public double getMassOfWater() {
        mass = DENSITY_OF_WATER * getContainerVolume();
        return mass;
    }

    @Override
    public double removeMassOfWater() {
        return this.mass;
    }

    @Override
    public String toString() {
        return String.format ("Box{ mass = %.2f }", mass);
    }
}