package eu.senla.task5.containers;

public class Cone extends AbstractContainer {

    public Cone(int sizeOfContainer) {
        super(sizeOfContainer);
    }

    @Override
    public double getContainerVolume() {
        double radius = getSizeOfDiameter();
        double highCone = getRandomHigh();
        volume = PI * Math.pow(radius/2, 2) * (highCone/3);
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
        return String.format( "Cone{ mass = %.2f }", mass);
    }
}

