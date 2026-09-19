package java_hw_6_part1.task1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println("Bird");
        bird.eat();
        bird.sleep();
        bird.fly();

        Fish fish = new Fish();
        System.out.println("\n Fish");
        fish.eat();
        fish.sleep();
        fish.swim();

        Dog dog = new Dog();
        System.out.println("\n Dog");
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
