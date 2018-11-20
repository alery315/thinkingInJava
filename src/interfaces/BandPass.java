package interfaces;

public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowcutoff, double highCutoff) {
        this.lowCutoff = lowcutoff;
        this.highCutoff = highCutoff;
    }

    public Waveform process(Waveform input) {
        //do something
        return input;
    }

}
