package Task3;

public class Main {
    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();

        System.out.println("Dog say: ");
        Animal dog = factory.createAnimal("dog");
        dog.speak();

        System.out.println("Cat say: ");
        Animal cat = factory.createAnimal("cat");
        cat.speak();

        System.out.println("Bird say: ");
        Animal bird = factory.createAnimal("bird");
        bird.speak();
    }
}
