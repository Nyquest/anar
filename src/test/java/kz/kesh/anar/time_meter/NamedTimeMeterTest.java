package kz.kesh.anar.time_meter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NamedTimeMeterTest {

    // NamedTimeMeter

    @Test
    void namedTimeMeter1() {
        NamedTimeMeter namedTimeMeter = new NamedTimeMeter();
        namedTimeMeter.start("foo");
        assertTrue(namedTimeMeter.toString().contains("foo"));
    }

    @Test
    void namedTimeMeter2() {
        NamedTimeMeter namedTimeMeter = new NamedTimeMeter();
        namedTimeMeter.start("foo");
        namedTimeMeter.start("bar");
        namedTimeMeter.stop("foo");
        assertTrue(namedTimeMeter.toString().contains("foo") && namedTimeMeter.toString().contains("bar"));
    }

    @Test
    void namedTimeMeter3() {
        NamedTimeMeter namedTimeMeter = new NamedTimeMeter("main");
        namedTimeMeter.start("foo");
        namedTimeMeter.start("bar");
        assertTrue(namedTimeMeter.toString().contains("main")
                && namedTimeMeter.toString().contains("foo")
                && namedTimeMeter.toString().contains("bar"));
    }

    @Test
    void namedTimeMeter4() {
        NamedTimeMeter namedTimeMeter = new NamedTimeMeter("main");
        Assertions.assertThrows(RuntimeException.class, () -> {
            namedTimeMeter.getDuration("foo");
        });
    }

    @Test
    void namedTimeMeter5() {
        Assertions.assertThrows(RuntimeException.class, () -> new NamedTimeMeter(null));
    }

    @Test
    void namedTimeMeter6() {
        NamedTimeMeter namedTimeMeter = new NamedTimeMeter();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            namedTimeMeter.start(" ");
        });
    }

    // getDuration

    @Test
    void getDuration1() {
        NamedTimeMeter namedTimeMeter = new NamedTimeMeter("main");
        assertTrue(namedTimeMeter.getDuration("main") >= 0);
    }

    // toString
    @Test
    void toString1() {
        NamedTimeMeter namedTimeMeter = new NamedTimeMeter("main");
        namedTimeMeter.start("foo");
        String info = namedTimeMeter.toString("main");
        assertTrue(info.contains("main"));
        assertFalse(info.contains("foo"));
    }
}