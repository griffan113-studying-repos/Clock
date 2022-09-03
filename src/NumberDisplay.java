public class NumberDisplay {
    int value;
    int limit;

    public NumberDisplay(int limit) {
        this.limit = limit;
        value = 0;
    }

    public NumberDisplay(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    public void increment() {
        value = ++value % limit;
    }

    public String getDisplayString() {
        return value < 10 ? "0" + value : "" + value;
    }

    public void setValue(int value) {
        if (value >= 0 && value < limit) {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }
}
