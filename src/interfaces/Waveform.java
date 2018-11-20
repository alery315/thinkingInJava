package interfaces;

public class Waveform {

    private static long counter;
    private static final long id = counter++;

    public String toString() {
        return "Waveform " + id;
    }
}
