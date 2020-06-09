package tdd.giledeRose.aep201;

public class BackStagePass {
    private  int sellIn;
    private  int quality;

    public BackStagePass(int sellIn, int quality) {

        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void oneDayPassed() {
        sellIn--;
        quality++;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
