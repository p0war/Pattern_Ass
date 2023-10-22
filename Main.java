public class Main {
    public static void main(String[] args) {
        Audio iPodAd = new iPodAdapter(new iPod());
        Audio SonyAd = new SonyAdapter(new SonyPlayer());

        iPodAd.startMusic();
        SonyAd.stopMusic();
    }
}
