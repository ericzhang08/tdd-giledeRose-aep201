package tdd.giledeRose.aep201;

public class NormalProduct {
    private  int sellIn;
    private  int quality;

    public NormalProduct(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void oneDayPassed() {
        if (sellIn <= 0) {
            quality--;
        }
        sellIn--;
        quality--;
        if (quality < 0) {
            quality = 0;
        }
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality--;
    }
}
