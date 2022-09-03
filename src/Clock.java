public class Clock {
    NumberDisplay hours;
    NumberDisplay minutes;
    String displayString;

    public Clock() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    private void updateDisplay() {
        displayString = hours.getDisplayString() + ":" + minutes.getDisplayString();
    }

    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) hours.increment();
    }
}
