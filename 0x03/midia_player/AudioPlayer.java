public class AudioPlayer implements MediaPlayer{
    @Override
    public void reproduzir(TipoMedia tipoMedia, String arquivo) {
        if(tipoMedia == TipoMedia.MP3){
            System.out.print("Reproduzindo MP3: " + arquivo);
        }
        else {
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(tipoMedia);
            mediaPlayerAdapter.reproduzir(tipoMedia,arquivo);
        }
    }
}
