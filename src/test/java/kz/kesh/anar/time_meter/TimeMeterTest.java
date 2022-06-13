package kz.kesh.anar.time_meter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeMeterTest {

    @Test
    void test() throws InterruptedException {
        TimeMeter timeMeter = new TimeMeter();
        Thread.sleep(1000);
        timeMeter.stop();
        assertTrue(timeMeter.getDuration() >= 1000);
    }

    @Test
    void test2() {
        TimeMeter timeMeter = new TimeMeter();
        timeMeter.stop();
        assertTrue(timeMeter.toString().matches("\\d+ msec"));
    }
}