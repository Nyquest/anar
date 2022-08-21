package kz.kesh.anar.time_meter;

public class AbstractTimeMeter {

    /**
     * Возвращает текущее значение источника времени в наносекундах
     * @return кол-во наносекунд
     */
    protected long now(){
        return System.nanoTime();
    }

    protected long nanoToMillis(long nanoseconds) {
        return nanoseconds / 1_000_000;
    }
}
