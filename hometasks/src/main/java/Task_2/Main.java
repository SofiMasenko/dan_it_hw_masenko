package Task_2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Vehicle existingCar = new Vehicle("Nissan Altima", 200, 7500.0, 4);
        Vehicle nullCar = null;

        System.out.println("------TESTING FOR AN EXISTING OBJECT------");

        Optional <Vehicle> optCar = Optional.ofNullable(existingCar);

        Vehicle res1 = optCar.orElse(new Vehicle("Some Car", 120, 2500.0, 4));
        System.out.println("orElse result " + res1);

        Vehicle res2 = optCar.orElseGet(() -> new Vehicle("Another car", 150, 9500.0,4));
        System.out.println("orElseGet result " + res2);

        try {
            Vehicle res3 = optCar.orElseThrow(() -> new IllegalStateException("Vehicke is missing!"));
            System.out.println("orElseThrow result " + res3);
        } catch (Exception e) {
            System.out.println("Exception. " + e.getMessage());
        }

        optCar.ifPresent(v -> System.out.println("ifPresent: Transport exists ->" + v.getName()));

        if (optCar.isPresent()) {
            System.out.println("ifPresentOrElse: Car found " + optCar.get().getName());
        } else {
            System.out.println("ifPresentOrElse: There is no transport");
        }

        System.out.println("-----TESTING FOR NULL OBJECT-----");

        Optional <Vehicle> optNullCar = Optional.ofNullable(nullCar);

        Vehicle resNull1 = optNullCar.orElse(new Vehicle("Default car", 200, 2500.0, 4));
        System.out.println("OrElse for null " + resNull1);

        Vehicle resNull2 = optNullCar.orElseGet(() -> {
            System.out.println("-> Executing lambda in orElseGet...");
            return new Vehicle("Car car", 100, 4000.0, 4);
        });
        System.out.println("OrElseGet for null " + resNull2);

        try {
            Vehicle resNull3 = optNullCar.orElseThrow(() -> new IllegalStateException("Critical error: Car not found!"));
            System.out.println(resNull3);
        } catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        optNullCar.ifPresent(v -> System.out.println("ifPresent: This will not be displayed."));

        if (optNullCar.isPresent()) {
            System.out.println("ifPresentOrElse: found -> " + optNullCar.get());
        } else {
            System.out.println("ifPresentOrElse:  Object is null, else branch fired!");
        }



    }
}
