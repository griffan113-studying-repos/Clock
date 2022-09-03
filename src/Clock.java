public class Clock {
    NumberDisplay hours;
    NumberDisplay minutes;
    NumberDisplay seconds;
    String displayString;

    public Clock() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    public void setTime(int hour, int minute, int second) {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }

    private void updateDisplay() {
        displayString = hours.getDisplayString() + ":" + minutes.getDisplayString() + ":" + seconds.getDisplayString();
    }

    public void timeTick() {
        seconds.increment();
        if (seconds.getValue() == 0) minutes.increment();
        if (minutes.getValue() == 0 && seconds.getValue() == 0) hours.increment();

        updateDisplay();

        System.out.println(displayString);
    }
}
