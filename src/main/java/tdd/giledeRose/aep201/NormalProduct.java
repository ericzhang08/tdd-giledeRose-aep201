package tdd.giledeRose.aep201;

public class NormalProduct {
    private  int sellIn;
    private  int quality;

    public NormalProduct(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void oneDayPassed() {
        sellIn--;
        quality--;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality--;
    }
}
