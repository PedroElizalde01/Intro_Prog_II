public abstract class Monitor {
    Measurement min;
    Measurement max;

    Monitor(Measurement min, Measurement max) {
        this.min = min;
        this.max = max;
    }

    public boolean isOkay(Measurement measurement){
        return measurement.compare(min) >= 0 && measurement.compare(max) <= 0;
    }
}
