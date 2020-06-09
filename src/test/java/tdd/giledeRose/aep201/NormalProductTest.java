package tdd.giledeRose.aep201;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalProductTest {

    @Test
    public void should_quality_and_sellIn_minus_one_when_one_day_passed_given_normal_product_on_date() {
        NormalProduct normalProduct = new NormalProduct(5, 10);
        normalProduct.oneDayPassed();
        assertEquals( 4, normalProduct.getSellIn());
        assertEquals(9, normalProduct.getQuality());
    }

    @Test
    public void should_quality_and_sellIn_minus_one_when_one_day_passed_given_normal_product_on_date_one_day() {
        NormalProduct normalProduct = new NormalProduct(1, 10);
        normalProduct.oneDayPassed();
        assertEquals( 0, normalProduct.getSellIn());
        assertEquals(9, normalProduct.getQuality());
    }

    @Test
    public void should_quality_minus_two_and_sell_in_minus_one_when_one_day_passed_given_normal_product_on_date_zero_day() {
        NormalProduct normalProduct = new NormalProduct(0, 10);
        normalProduct.oneDayPassed();
        assertEquals( -1, normalProduct.getSellIn());
        assertEquals(8, normalProduct.getQuality());
    }
}
