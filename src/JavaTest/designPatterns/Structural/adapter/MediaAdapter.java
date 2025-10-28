package JavaTest.designPatterns.Structural.adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;   //Reference variable

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        advancedMediaPlayer.playMp4(fileName);

    }
}
