package kz.kesh.anar.time_meter;

/**
 * Класс для замера времени работы блока кода
 */
public class TimeMeter extends AbstractTimeMeter{
    private final long start;
    private long stop;

    /**
     * Начать замер времени
     */
    public TimeMeter(){
        start = now();
    }

    /**
     * Остановить замер времени (можно делать это несколько раз)
     */
    public void stop(){
        stop = now();
    }

    /**
     * Получить продолжительность в миллисекундах
     * @return кол-во миллисекунд
     */
    public long getDuration(){
        return nanoToMillis((stop == 0 ? now() : stop) - start);
    }

    /**
     * Вернуть продолжительность в формате: [кол-во миллисекунд] + " msec"
     * @return [кол-во миллисекунд] + " msec"
     */
    @Override
    public String toString() {
        return getDuration() + " msec";
    }
}
