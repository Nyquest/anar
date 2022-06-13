## Коллекция утилитарных классов

### StringUtils (методы по работе со строками)
**boolean isEmpty(String value)** - метод проверяет переданную строку на непустоту. 
Пустыми строка считаются значения: null, "", " ", "   " и строки, состоящие только из пробельных символов

'''java
System.out.println(StringUtils.isEmpty(null)); // true
System.out.println(StringUtils.isEmpty("")); // true
System.out.println(StringUtils.isEmpty(" ")); // true
System.out.println(StringUtils.isEmpty("   ")); // true
System.out.println(StringUtils.isEmpty("\t \n")); // true
System.out.println(StringUtils.isEmpty("a")); // false
System.out.println(StringUtils.isEmpty(" a")); // false
'''

**boolean isNotEmpty(String value)** - метод проверяет переданную строку на пустоту.
Пустыми строка считаются значения: null, "", " ", "   " и строки, состоящие только из пробельных символов
