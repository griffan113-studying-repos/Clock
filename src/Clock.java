public class Clock {
    NumberDisplay hours;
    NumberDisplay minutes;
    String displayString;

    public Clock() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
    }

    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        hours.setValue(minute);
    }
}
