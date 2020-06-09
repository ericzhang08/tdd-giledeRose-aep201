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



}