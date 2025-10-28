package JavaTest.designPatterns.Structural.example1;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter(new AdvancedMediaPlayer());  //Assingning the reference variable
        player.play("MP4");
    }
}
