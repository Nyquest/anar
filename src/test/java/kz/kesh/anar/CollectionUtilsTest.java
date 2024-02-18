package kz.kesh.anar;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CollectionUtilsTest {

    @Test
    void moveElement() {
        List<Integer> list = asList(1, 2, 3);
        CollectionUtils.moveElement(list, 0, 2);
        assertEquals(asList(2, 3, 1), list);
    }

    @Test
    void moveElementInEmptyList() {
        List<Integer> list = emptyList();
        CollectionUtils.moveElement(list, 0, 2);
        assertEquals(emptyList(), list);
    }

    @Test
    void moveElementIndexOutOfBoundsException() {
        List<Integer> list = singletonList(1);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.moveElement(list, 0, 2);
        });
    }

    @Test
    void moveElementInListWithOneElement() {
        List<Integer> list = asList(3);
        CollectionUtils.moveElement(list, 0, 0);
        assertEquals(asList(3), list);
    }

    @Test
    void moveElementFromRightToLeft() {
        List<Integer> list = asList(1, 2, 3, 4, 5);
        CollectionUtils.moveElement(list, 3, 1);
        assertEquals(asList(1, 4, 2, 3, 5), list);
    }

    @Test
    void moveElementThereAndBack() {
        List<Integer> list = asList(1, 2, 3, 4, 5);
        CollectionUtils.moveElement(list, 0, 4);
        CollectionUtils.moveElement(list, 4, 0);
        assertEquals(asList(1, 2, 3, 4, 5), list);
    }
}