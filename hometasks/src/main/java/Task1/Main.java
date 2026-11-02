package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", 200));
        cars.add(new Car("Tesla", 180));
        cars.add(new Car("Mazda", 210));
        cars.add(new Car("Volvo", 220));
        cars.add(new Car("Nissan", 225));

        System.out.println("-----Initial list of machines-----");

        System.out.println(cars);


        cars.sort(Comparator.comparingInt(Car:: getSpeed));

        System.out.println("-----Sorted list of cars by speed-----");

        System.out.println(cars);

    }
}
