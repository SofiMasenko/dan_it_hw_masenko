package Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("------- Dog food warehouse -------");
        Warehouse <Food> foodWarehouse = new Warehouse<>();

        System.out.println("Is the warehouse empty? " + foodWarehouse.isEmpty());

        foodWarehouse.addItem(new Food("Dry Food Exclusion"));
        foodWarehouse.addItem(new Food("Dry Food Brit Care"));
        foodWarehouse.addItem(new Food("Dry Food Monge"));
        foodWarehouse.addItem(new Food("Dry Food Farmina"));

        System.out.println("Quantity of items in stock" + " " + foodWarehouse.getItemCount());
        System.out.println("View products without deleting" + " " + foodWarehouse.viewItems());
        System.out.println("Is the warehouse empty after adding?" + " " + foodWarehouse.isEmpty());

        List <Food> takenFood = foodWarehouse.retrieveAll();
        System.out.println("Taken from the warehouse" + takenFood);
        System.out.println("Quantity of items in stock after taken" + " " + foodWarehouse.getItemCount());
        System.out.println("Is the warehouse empty now?" + " " + foodWarehouse.isEmpty());

        System.out.println("------- Accessories and medicine inventory --------");

        Warehouse <DogProduct> generalDogWarehouse = new Warehouse<>();

        generalDogWarehouse.addItem(new Leash("Collar"));
        generalDogWarehouse.addItem(new Leash("BullyBillows"));
        generalDogWarehouse.addItem(new Leash("Hunter"));
        generalDogWarehouse.addItem(new Medicine("Simparica"));
        generalDogWarehouse.addItem(new Medicine("Nexgard"));
        generalDogWarehouse.addItem(new Medicine("Bravecto"));

        System.out.println("General dog warehouse item:" + " " + generalDogWarehouse.viewItems());

        generalDogWarehouse.clear();
        System.out.println("The warehouse is cleaned. Quantity of items in stock:" + " " + generalDogWarehouse.getItemCount());



    }
}
