package tdd.giledeRose.aep201;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackStagePassTest {
    @Test
    public void should_quality_add_one_and_sellIn_minus_one_when_one_day_passed_given_back_stage_pass_on_date_more_than_10_days() {
        BackStagePass backStagePass = new BackStagePass(11, 10);
        backStagePass.oneDayPassed();
        assertEquals( 10, backStagePass.getSellIn());
        assertEquals(11, backStagePass.getQuality());
    }

    @Test
    public void should_quality_add_two_and_sellIn_minus_one_when_one_day_passed_given_back_stage_pass_on_date_more_than_5_days_less_than_10_days() {
        BackStagePass backStagePass = new BackStagePass(10, 10);
        backStagePass.oneDayPassed();
        assertEquals( 9, backStagePass.getSellIn());
        assertEquals(12, backStagePass.getQuality());
    }

    @Test
    public void should_quality_add_Three_and_sellIn_minus_one_when_one_day_passed_given_back_stage_pass_on_date_less_than_5_days() {
        BackStagePass backStagePass = new BackStagePass(5, 10);
        backStagePass.oneDayPassed();
        assertEquals( 4, backStagePass.getSellIn());
        assertEquals(13, backStagePass.getQuality());
    }

    @Test
    public void should_quality_is_zero_and_sellIn_minus_one_when_one_day_passed_given_back_stage_pass_out_of_date() {
        BackStagePass backStagePass = new BackStagePass(0, 10);
        backStagePass.oneDayPassed();
        assertEquals( -1, backStagePass.getSellIn());
        assertEquals(0, backStagePass.getQuality());
    }

    @Test
    public void should_quality_is_50_and_sellIn_minus_one_when_one_day_passed_given_back_stage_pass_quality_is_49() {
        BackStagePass backStagePass = new BackStagePass(5, 49);
        backStagePass.oneDayPassed();
        assertEquals( 4, backStagePass.getSellIn());
        assertEquals(50, backStagePass.getQuality());
    }



}