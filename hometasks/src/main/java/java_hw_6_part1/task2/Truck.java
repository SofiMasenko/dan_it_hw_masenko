package java_hw_6_part1.task2;

public class Truck extends Vehicle{
    public double loadCapacity;
    public Truck (String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("Transport " + " " + name + " with load capacity"  + " " + loadCapacity + " " +  "is moving at a speed of " + speed + " km/h");
    }
}
