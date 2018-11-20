package interfaces;

import polymorphism.Note;

interface Instrument {
    int VALUE = 5;  // final static

    void play(Note note);  // public

    void adjust();

}

class Wind implements Instrument {

    @Override
    public void play(Note note) {
        System.out.println(this + ".play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Wind";
    }

}

class Percussion implements Instrument {

    @Override
    public void play(Note note) {
        System.out.println(this + ".play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Percussion";
    }

}

class Stringed implements Instrument {

    @Override
    public void play(Note note) {
        System.out.println(this + ".play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Stringed";
    }

}


class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class WoodWind extends Wind {
    public String toString() {
        return "WoodWind";
    }
}


public class Music5 {


    static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    static void adjust(Instrument instrument) {
        instrument.adjust();
    }


    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[]{
                new Wind(), new Stringed(), new Percussion(),
                new Brass(), new WoodWind()
        };

        for (Instrument instrument : instruments) {
            tune(instrument);
            adjust(instrument);
        }


    }


}
