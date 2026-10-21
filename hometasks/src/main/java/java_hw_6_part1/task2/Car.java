package java_hw_6_part1.task2;

public class Car extends Vehicle{
    public int passengerCapacity;

    public Car (String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengerCapacity=" + passengerCapacity +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                "} " ;
    }
}
