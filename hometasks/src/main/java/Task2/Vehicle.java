package Task2;

public class Vehicle {
    private static Vehicle instanse;

    private String model;
    private String type;

    private Vehicle (){
        this.model = "Nissan";
        this.type = "Electric car";
        System.out.println("A single instance of the Vehicle class has been created!");
    }

    public static Vehicle getInstance() {
        if (instanse == null) {
            instanse = new Vehicle();
        }
        return instanse;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
