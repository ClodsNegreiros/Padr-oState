public abstract class State {

    protected AudioPlayer player;

    public State(AudioPlayer player) {
        this.player = player;
    }

    public abstract void clickStop();
    public abstract void clickPlay();
    public abstract void clickNext();
    public abstract void clickPrevious();

}
