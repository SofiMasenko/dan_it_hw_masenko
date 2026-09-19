package java_hw_6_part1.task3;

public class Main {
    public static void main(String[] args) {
        Media media1 = new Music("21 Guns",5, "Green Day");
        Media media2 = new Video("Eternal Sunshine of the Spotless Mind",108, "1920x1080");

        media1.play();
        media2.play();

    }
}
