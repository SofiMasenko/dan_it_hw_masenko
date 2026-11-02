package Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Trying to get the first copy----");

        Vehicle vehicle1 = Vehicle.getInstance();
        System.out.println(vehicle1 );

        System.out.println("-----Trying to get a second copy-----");

        Vehicle vehicle2 = Vehicle.getInstance();
        System.out.println(vehicle2);

        System.out.println("Do vehicle1 and vehicle2 refer to the same object? ");
        System.out.println(vehicle1 == vehicle2);

        vehicle1.setModel("Tesla s 1");
        System.out.println("After changing the model via vehicle1:");
        System.out.println(vehicle2.getModel());
    }
}
