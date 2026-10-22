package Task1;

public abstract class DogProduct {

    private String name;

    public DogProduct(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DogProduct{" +
                "name='" + name + '\'' +
                '}';
    }
}
