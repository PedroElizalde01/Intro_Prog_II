public class OxygenMonitor extends Monitor{
    private final static Measurement min = new IntMeasurement(90);
    private final static Measurement max = new IntMeasurement(100);

    OxygenMonitor() { super(min, max); }
}
