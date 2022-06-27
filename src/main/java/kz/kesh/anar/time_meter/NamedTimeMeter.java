package kz.kesh.anar.time_meter;

import kz.kesh.anar.StringUtils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Именнованные секундомеры для замера времени работы блоков кода с именованными секундомером
 */
public class NamedTimeMeter {
    private Map<String, Long> startMap; // время запуска секундомера (key - наименование секундомера, value - время запуска в миллисекундах)
    private Map<String, Long> stopMap;  // время остановки секундомера (key - наименование секундомера, value - время остановки в миллисекундах)

    /**
     * Инициализация секундомеров
     */
    public NamedTimeMeter(){
        startMap = new LinkedHashMap<>(); // LinkedHashMap для сохранения порядка таймеров
        stopMap = new HashMap<>();
    }

    /**
     * Запуск секундомера в момент инициализации с заданным наименованием
     * @param timerName наименование секундомера
     */
    public NamedTimeMeter(String timerName){
        this();
        start(timerName);
    }

    /**
     * Запуск секундомера
     * @param timerName наименование секундомера
     */
    public void start(String timerName){
        validateTimerName(timerName);
        startMap.put(timerName, now());
    }

    /**
     * Остановка секундомера
     * @param timerName наименование секундомера
     */
    public void stop(String timerName){
        validateTimerName(timerName);
        stopMap.put(timerName, now());
    }

    /**
     * Получить продолжительность, отмеренная секундомером
     * @param timerName наименование секундомера
     * @return продолжительность в миллисекундах
     */
    public long getDuration(String timerName){
        validateTimerName(timerName);
        Long start = startMap.get(timerName);
        if(start == null){
            throw new RuntimeException("Timer " + timerName + " is not started");
        }
        Long stop = stopMap.get(timerName);
        return (stop == null ? now() : stop) - start;
    }

    /**
     * Текущее время в миллисекундах
     * @return
     */
    private long now(){
        return System.currentTimeMillis();
    }

    /**
     * Проверка наименавания таймера
     * @param value наименование таймера
     */
    private void validateTimerName(String value){
        if(StringUtils.isEmpty(value)){
            throw new IllegalArgumentException("Empty name of timer!");
        }
    }

    /**
     * Вернуть информацию обо всех секундомерах
     * @return показания секундомеров
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n*** timers ***\n");
        for (String timerName : startMap.keySet()) {
            sb.append(timerName).append(": ").append(getDuration(timerName)).append(" msec\n");
        }
        sb.append("**************\n\n");
        return sb.toString();
    }

    /**
     * Вернуть информацию по конкретному секундомеру
     * @param timerName наименование секундомера
     * @return показания секундомера
     */
    public String toString(String timerName){
        validateTimerName(timerName);
        return "Timer '" + timerName + "': " + getDuration(timerName) + "msec";
    }

}
