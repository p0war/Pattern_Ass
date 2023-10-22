public class iPodAdapter implements Audio {
    private iPod iPod;

    public iPodAdapter(iPod iPod) {
        this.iPod = iPod;
    }

    @Override
    public void startMusic() {
        iPod.iPodPlay();
    }

    @Override
    public void stopMusic() {
        iPod.iPodStop();
    }
}
