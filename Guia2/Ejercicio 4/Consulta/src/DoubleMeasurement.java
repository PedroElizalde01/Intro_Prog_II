public class DoubleMeasurement extends Measurement{
    private final double measurement;

    public DoubleMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public double getMeasurement() {
        return measurement;
    }

    @Override
    public int compare(Measurement measurement2) {
        double comparison = measurement - ((DoubleMeasurement) measurement2).getMeasurement();
        if (comparison > 0){
            return 1;
        }else if (comparison < 0){
            return -1;
        }
        return 0;
    }
}
