package Pro8.MediaPlayer;

public class FullModePlayerBuilder extends MediaPlayerBuilder {
    @Override
    public void showMenu() {
        mediaPlayer.setMenu("menu");
    }

    @Override
    public void showPlayList() {
        mediaPlayer.setPlayList("playList");
    }

    @Override
    public void showMainWindow() {
        mediaPlayer.setMainWindow("mainWindow");
    }

    @Override
    public void showControlBar() {
        mediaPlayer.setControlBar("controlBar");
    }

    @Override
    public void showFavouriteList() {
        mediaPlayer.setFavouriteList("favouriteList");
    }
}
