package Task4;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car.Builder()
                .setModel("Nissan")
                .setPrice("2000")
                .setMaxSpeed(200)
                .setCountOfWheels(4)
                .build();

        System.out.println(myCar);


    }
}
