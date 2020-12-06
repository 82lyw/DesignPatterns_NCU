package Pro8.MediaPlayer;

public class SimpleModePlayBuilder extends MediaPlayerBuilder {
    @Override
    public void showMenu() {

    }

    @Override
    public void showPlayList() {

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

    }
}
