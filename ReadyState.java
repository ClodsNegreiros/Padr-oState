public class ReadyState extends State {

    public ReadyState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickStop() {
        this.player.changeState(new LockedState(this.player));
        this.player.setPlaying(false);
    }

    @Override
    public void clickPlay() {
        this.player.changeState(new PlayingState(this.player));
        this.player.setPlaying(true);
    }

    @Override
    public void clickNext() {

    }

    @Override
    public void clickPrevious() {
        
    }

    public String toString() {
        return "Ready";
    }
}