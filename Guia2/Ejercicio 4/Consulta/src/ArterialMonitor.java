public class ArterialMonitor extends Monitor{
    private final static Measurement min = new DoubleMeasurement(1.43);
    private final static Measurement max = new DoubleMeasurement(1.54);

    ArterialMonitor() {
        super(min, max);
    }
}
