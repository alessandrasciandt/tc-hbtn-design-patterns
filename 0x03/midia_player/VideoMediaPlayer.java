public class VideoMediaPlayer implements AdvancedMediaPlayer{
    @Override
    public void reproduzirVlc(String arquivo) {
        System.out.print("Reproduzindo VLC: " + arquivo);
    }

    @Override
    public void reproduzirMp4(String arquivo) {
        System.out.print("Reproduzindo MP4: " + arquivo);
    }
}
