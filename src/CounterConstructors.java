public class CounterConstructors {
    private int value;

    public CounterConstructors(int startValue) {
        this.value = startValue;
    }

    public CounterConstructors() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    // increase
    public void increase (int increaseBy) {
        if (increaseBy >= 0) {
            this.value = this.value + increaseBy;
        }
    }

    // decrease
    public void decrease (int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value = this.value - decreaseBy;
        }
    }
}