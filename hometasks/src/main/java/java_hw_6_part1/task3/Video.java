package java_hw_6_part1.task3;

public class Video extends Media {

    public String resolution;
    public Video (String title, int duration, String resolution) {
        super(title, duration);
        this. resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("The video is playing " + title + " in resolution " + resolution);
    }
}
