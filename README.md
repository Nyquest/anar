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

### Класс TimeMeter для замера времени
При создании объекта TimeMeter запускается измеритель времени, для его остановки нужно вызвать метод stop или toString.

Пример использования #1:
```java
TimeMeter timeMeter = new TimeMeter(); // запуск измерителя
// ... код, для которого измеряется продолжительность выполнения
System.out.println(timeMeter); // 1 msec
```

Пример использования #2:
```java
TimeMeter timeMeter = new TimeMeter(); // запуск измерителя
// ... код, для которого измеряется продолжительность выполнения
timeMeter.stop();
// .. другой код
System.out.println(timeMeter); // 1 msec
```

Пример использование #3:
```java
TimeMeter timeMeter = new TimeMeter(); // запуск измерителя
// ... код, для которого измеряется промежуточная продолжительность выполнения
System.out.println(timeMeter); // 1 msec
// .. код, для которого измеряется продолжительность выполнения
System.out.println(timeMeter); // 2 msec
```

### NameUtils (методы по работе с именами и названиями)
**String getFullName(String lastName, String firstName, String middleName)** - метод преобразует фамилию, имя и отчество в ФИО

Примеры:
```java
NameUtils.getFullName("Сериков", "Серик", "Серикович") // Сериков Серик Серикович
NameUtils.getFullName("Сериков", "Серик", null) // Сериков Серик
NameUtils.getFullName("Сериков", null, null) // Сериков
NameUtils.getFullName(null, "Серик", "Серикович") // Серик Серикович
```

**String getShortName(String lastName, String firstName, String middleName)** - метод преобразует фамилию, имя и отчество в формат: Фамилия + инициалы (И.О.)

Примеры:
```java
NameUtils.getShortName("Сериков", "Танат", "Еркинович") // Сериков Т.Е.
NameUtils.getShortName("Сериков", "Танат", "\n") // Сериков Т.
NameUtils.getShortName("Сериков", "", "") // Сериков
NameUtils.getShortName("", "Танат", "Еркинович") // Т.Е.
```