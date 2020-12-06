package Pro8.MediaPlayer;

import Pro7.Game.Person;
import Pro7.Game.PersonBuilder;

public class MediaBuildingDirector {
    private MediaPlayerBuilder mediaPlayerBuilder;
    public void setMediaBuilder(MediaPlayerBuilder mediaPlayerBuilder) {
        this.mediaPlayerBuilder = mediaPlayerBuilder;
    }
    public MediaPlayer construct() {
        mediaPlayerBuilder.showControlBar();
        mediaPlayerBuilder.showFavouriteList();
        mediaPlayerBuilder.showMainWindow();
        mediaPlayerBuilder.showMenu();
        mediaPlayerBuilder.showPlayList();
        return mediaPlayerBuilder.mediaPlayer;
    }
}
