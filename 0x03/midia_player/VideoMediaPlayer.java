public class VideoMediaPlayer implements AdvancedMediaPlayer{
    @Override
    public void reproduzirVlc(String arquivo) {
        System.out.println("Reproduzindo VLC: " + arquivo);
    }

    @Override
    public void reproduzirMp4(String arquivo) {
        System.out.println("Reproduzindo MP4: " + arquivo);
    }
}
