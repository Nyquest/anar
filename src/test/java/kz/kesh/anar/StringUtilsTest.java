package kz.kesh.anar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    // isEmpty

    @Test
    void isEmpty1() {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    void isEmpty2() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    void isEmpty3() {
        assertTrue(StringUtils.isEmpty(" "));
    }

    @Test
    void isEmpty4() {
        assertTrue(StringUtils.isEmpty("     "));
    }

    @Test
    void isEmpty5() {
        assertFalse(StringUtils.isEmpty("a"));
    }

    @Test
    void isEmpty6() {
        assertFalse(StringUtils.isEmpty("  a"));
    }

    @Test
    void isEmpty7() {
        assertTrue(StringUtils.isEmpty("\t "));
    }

    @Test
    void isEmpty8() {
        assertTrue(StringUtils.isEmpty(" \r\n\t "));
    }

    // isNotEmpty

    @Test
    void isNotEmpty1() {
        assertFalse(StringUtils.isNotEmpty(null));
    }

    @Test
    void isNotEmpty2() {
        assertFalse(StringUtils.isNotEmpty(""));
    }

    @Test
    void isNotEmpty3() {
        assertFalse(StringUtils.isNotEmpty(" "));
    }

    @Test
    void isNotEmpty4() {
        assertFalse(StringUtils.isNotEmpty("     "));
    }

    @Test
    void isNotEmpty5() {
        assertTrue(StringUtils.isNotEmpty("a"));
    }

    @Test
    void isNotEmpty6() {
        assertTrue(StringUtils.isNotEmpty("  a"));
    }

    @Test
    void isNotEmpty7() {
        assertFalse(StringUtils.isNotEmpty("\t "));
    }

    @Test
    void isNotEmpty8() {
        assertFalse(StringUtils.isNotEmpty(" \r\n\t "));
    }
}