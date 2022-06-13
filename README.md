## Коллекция утилитарных классов

### StringUtils (методы по работе со строками)
**boolean isEmpty(String value)** - метод проверяет переданную строку на непустоту. 
Пустыми строка считаются значения: null, "", " ", "   " и строки, состоящие только из пробельных символов.

Примеры:
```java
StringUtils.isEmpty(null) // true
StringUtils.isEmpty("") // true
StringUtils.isEmpty(" ") // true
StringUtils.isEmpty("   ") // true
StringUtils.isEmpty("\t \n") // true
StringUtils.isEmpty("a") // false
StringUtils.isEmpty(" a") // false
```

**boolean isNotEmpty(String value)** - метод проверяет переданную строку на пустоту.
Пустыми строка считаются значения: null, "", " ", "   " и строки, состоящие только из пробельных символов.

Примеры:
```java
StringUtils.isNotEmpty(null) // false
StringUtils.isNotEmpty("") // false
StringUtils.isNotEmpty(" ") // false
StringUtils.isNotEmpty("   ") // false
StringUtils.isNotEmpty("\t \n") // false
StringUtils.isNotEmpty("a") // true
StringUtils.isNotEmpty(" a") // true
```