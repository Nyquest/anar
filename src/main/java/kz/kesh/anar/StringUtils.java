package kz.kesh.anar;

/**
 * Строковые утилиты
 */
public class StringUtils {

    /**
     * Проверить строку на непустоту.
     * Пустыми строками считаются строки: null, "", " ", "   "
     * @param value строка
     * @return true - строка не пустая
     */
    public static boolean isNotEmpty(String value) {
        return !isEmpty(value);
    }

    /**
     * Проверить строку на пустоту.
     * Пустыми строками считаются строки: null, "", " ", "   "
     * @param value строка
     * @return true - строка пустая
     */
    public static boolean isEmpty(String value) {
        int strLen;
        if (value == null || (strLen = value.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
