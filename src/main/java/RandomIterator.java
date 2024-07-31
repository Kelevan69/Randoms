import java.util.Iterator;

public class RandomIterator implements Iterator<Integer> {
    private Randoms randoms;

    public RandomIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        // Итератор бесконечный, всегда возвращает true
        return true;
    }

    @Override
    public Integer next() {
        // Генерация случайного числа в заданном диапазоне
        return randoms.random.nextInt(randoms.max - randoms.min + 1) + randoms.min;
    }
}
