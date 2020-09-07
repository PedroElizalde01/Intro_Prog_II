public class CardiacMonitor extends Monitor{
    private final static IntMeasurement min = new IntMeasurement(60);
    private final static IntMeasurement max = new IntMeasurement(120);

    public CardiacMonitor() {
        super(min, max);
    }
}
