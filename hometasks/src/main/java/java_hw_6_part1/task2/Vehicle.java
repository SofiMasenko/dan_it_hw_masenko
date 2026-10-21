package java_hw_6_part1.task2;

public class Vehicle {
    public String name;
    public int speed;

    public Vehicle (String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public void move () {

        System.out.println("Vehicle is moving at a speed of " + speed + " km/h") ;
    }
    public void stop () {
        System.out.println("Transport" + " " + name + " has stopped");
    }
}
