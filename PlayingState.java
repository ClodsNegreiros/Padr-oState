public class PlayingState extends State {

    public PlayingState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickStop() {
        this.player.changeState(new LockedState(this.player));
        this.player.setPlaying(false);
    }

    @Override
    public void clickPlay() {
        this.player.changeState(new ReadyState(this.player));
        this.player.setPlaying(false);
    }

    @Override
    public void clickNext() {
        this.player.nextTrack();
    }

    @Override
    public void clickPrevious() {
        this.player.previousTrack();
    }

    public String toString() {
        return "Playing";
    }

}