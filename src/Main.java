public class Main {
    public static void main(String[] args) {
        final Clock clock = new Clock();

        clock.setTime(15, 59, 57);

        clock.timeTick();
        clock.timeTick();
        clock.timeTick();
        clock.timeTick();
        clock.timeTick();
    }
}