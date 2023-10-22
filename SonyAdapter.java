public class SonyAdapter implements Audio {
    private SonyPlayer SonyPlayer;

    public SonyAdapter(SonyPlayer SonyPlayer) {
        this.SonyPlayer = SonyPlayer;
    }

    @Override
    public void startMusic() {
        SonyPlayer.SonyPlay();
    }

    @Override
    public void stopMusic() {
        SonyPlayer.SonyStop();
    }
}
