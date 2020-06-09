package tdd.giledeRose.aep201;

public class BackStagePass {
    private int sellIn;
    private int quality;

    public BackStagePass(int sellIn, int quality) {

        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void oneDayPassed() {
        quality++;
        if (sellIn <= 10) {
            quality++;
        }
        sellIn--;

    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
