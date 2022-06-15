package kz.kesh.anar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameUtilsTest {

    // getFullName

    @Test
    void getFullName1() {
        assertEquals("Сериков Серик Серикович", NameUtils.getFullName("Сериков", "Серик", "Серикович"));
    }

    @Test
    void getFullName2() {
        assertEquals("Сериков", NameUtils.getFullName("Сериков", null, null));
    }

    @Test
    void getFullName3() {
        assertEquals("Сериков Серик", NameUtils.getFullName("Сериков", "Серик", null));
    }

    @Test
    void getFullName4() {
        assertEquals("Сериков Серикович", NameUtils.getFullName("Сериков", null, "Серикович"));
    }

    @Test
    void getFullName5() {
        assertEquals("Серик Серикович", NameUtils.getFullName(null, "Серик", "Серикович"));
    }

    @Test
    void getFullName6() {
        assertEquals("Серикович", NameUtils.getFullName(null, null, "Серикович"));
    }

    // getShortName

    @Test
    void getShortName1() {
        assertEquals("Сериков Т.Е.", NameUtils.getShortName("Сериков", "Танат", "Еркинович"));
    }

    @Test
    void getShortName2() {
        assertEquals("Сериков Е.", NameUtils.getShortName("Сериков", "", "Еркинович"));
    }

    @Test
    void getShortName3() {
        assertEquals("Сериков", NameUtils.getShortName("Сериков", "", ""));
    }

    @Test
    void getShortName4() {
        assertEquals("Т.Е.", NameUtils.getShortName("", "Танат", "Еркинович"));
    }

    @Test
    void getShortName5() {
        assertEquals("Сериков Т.", NameUtils.getShortName("Сериков", "Танат", "\n"));
    }
}