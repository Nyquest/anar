package kz.kesh.anar;

import static kz.kesh.anar.StringUtils.isNotEmpty;

/**
 * Набор методов по работе с именами и названиями
 */
public class NameUtils {

    /**
     * Получить полное ФИО
     * @param lastName фамилия
     * @param firstName имя
     * @param middleName отчество
     * @return ФИО
     */
    public static String getFullName(String lastName, String firstName, String middleName) {
        StringBuilder sb = new StringBuilder();
        if(isNotEmpty(lastName)){
            sb.append(lastName);
        }
        if(isNotEmpty(firstName)){
            if(sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(firstName);
        }
        if(isNotEmpty(middleName)){
            if(sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(middleName);
        }
        return sb.toString();
    }

    /**
     * Получить сокращенное имя (фамилию и инициалы в формате: Фамилия И.О.)
     * @param lastName фамилия
     * @param firstName имя
     * @param middleName отчество
     * @return ФИО
     */
    public static String getShortName(String lastName, String firstName, String middleName) {
        StringBuilder sb = new StringBuilder();
        if (lastName != null) {
            sb.append(lastName);
        }
        boolean firstNameExists = isNotEmpty(firstName);
        if(firstNameExists){
            if(sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(firstName.substring(0, 1).toUpperCase());
            sb.append(".");
        }
        if(isNotEmpty(middleName)){
            if(sb.length() > 0 && !firstNameExists) {
                sb.append(" ");
            }
            sb.append(middleName.substring(0, 1).toUpperCase());
            sb.append(".");
        }
        return sb.toString();
    }

}
