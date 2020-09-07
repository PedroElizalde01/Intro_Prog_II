public class IntMeasurement extends Measurement{
    private final int measurement;

    public IntMeasurement(int measurement) {
        this.measurement = measurement;
    }

    public int getMeasurement() {
        return measurement;
    }

    @Override
    public int compare(Measurement measurement2) {
        return measurement - ((IntMeasurement) measurement2).getMeasurement();
    }
}
