package java_hw_6_part1.task2;

public class Truck extends Vehicle{
    public double loadCapacity;

    public Truck (String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                "} " ;
    }
}
