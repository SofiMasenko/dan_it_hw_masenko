package Task3;

public class AnimalFactory {
    public Animal createAnimal (String type)  {
        if (type == null) {
            return null;
        }
        switch (type.trim().toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "bird":
                return new Bird();
            default:
                System.out.println("unknown type of animal " + type);
                return null;
        }
    }
}
