public class MediaPlayerAdapter implements MediaPlayer{

    protected AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if(tipoMedia != TipoMedia.MP3){
            advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String arquivo) {
        if(tipoMedia == TipoMedia.VLC){
            advancedMediaPlayer.reproduzirVlc(arquivo);
        }else{
            advancedMediaPlayer.reproduzirMp4(arquivo);
        }
    }

}
