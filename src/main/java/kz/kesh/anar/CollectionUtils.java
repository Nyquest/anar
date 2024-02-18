package kz.kesh.anar;

import java.util.List;

public class CollectionUtils {

    public static <T> void moveElement(List<T> list, int from, int to) {
        if(list.isEmpty()) {
            return;
        }
        T swap = list.get(from);
        if(from <= to) {
            for (int i = from + 1; i <= to; ++i) {
                list.set(i - 1, list.get(i));
            }
        } else {
            for (int i = from - 1; i >= to; --i) {
                list.set(i + 1, list.get(i));
            }
        }
        list.set(to, swap);
    }

}
