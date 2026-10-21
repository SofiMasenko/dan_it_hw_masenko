package java_hw_6_part1.task2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", 120, 4);
        System.out.println("Passenger car");
        car.move();
        car.stop();

        Truck truck = new Truck("MAN", 80, 20.3);
        System.out.println("\n Truck");
        truck.move();
        truck.stop();
    }
}
