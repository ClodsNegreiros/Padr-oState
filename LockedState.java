public class LockedState extends State {

    public LockedState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickStop() {
        if (this.player.isPlaying())
            this.player.changeState(new ReadyState(this.player));
    }

    @Override
    public void clickPlay() {
        this.player.changeState(new ReadyState(this.player));
    }

    @Override
    public void clickNext() {

    }

    @Override
    public void clickPrevious() {

    }

    public String toString() {
        return "Locked";
    }

}