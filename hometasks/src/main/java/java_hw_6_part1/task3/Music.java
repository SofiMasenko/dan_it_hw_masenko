package java_hw_6_part1.task3;

public class Music extends Media {
    public String artist;
    public Music (String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing music" + " " + artist + ":" + title);
    }
}
