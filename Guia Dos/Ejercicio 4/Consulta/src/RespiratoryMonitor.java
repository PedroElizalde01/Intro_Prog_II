public class RespiratoryMonitor extends Monitor{
    private final static Measurement min = new IntMeasurement(12);
    private final static Measurement max = new IntMeasurement(20);

    public RespiratoryMonitor() {
        super(min, max);
    }
}
