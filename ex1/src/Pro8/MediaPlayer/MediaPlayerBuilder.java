package Pro8.MediaPlayer;

public abstract class MediaPlayerBuilder {
    protected MediaPlayer mediaPlayer;

    public abstract void showMenu();
    public abstract void showPlayList();
    public abstract void showMainWindow();
    public abstract void showControlBar();
    public abstract void showFavouriteList();

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
}
