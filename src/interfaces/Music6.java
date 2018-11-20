package interfaces;

import polymorphism.Note;

interface Instrument1 {
    int VALUE = 5;
    abstract void adjust();

}

interface Playable {
    void play(Note note);
}

class Wind1 implements Playable, Instrument1 {

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

class Percussion1 implements Playable, Instrument1 {

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

class Stringed1 implements Playable, Instrument1 {

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


class Brass1 extends Wind1 {
    public String toString() {
        return "Brass";
    }
}

class WoodWind1 extends Wind1 {
    public String toString() {
        return "WoodWind";
    }
}


public class Music6 {


    static void tune(Playable playable) {
        playable.play(Note.MIDDLE_C);
    }

    static void adjust(Instrument1 instrument) {
        instrument.adjust();
    }


    public static void main(String[] args) {

        Instrument1[] instruments = new Instrument1[]{
                new Wind1(), new Stringed1(), new Percussion1(),
                new Brass1(), new WoodWind1(), new Brass1()
        };

        Playable[] playables = new Playable[]{
                new Wind1(), new Stringed1(), new Percussion1(),
                new Brass1(), new WoodWind1()
        };

        for (Instrument1 instrument : instruments) {
            adjust(instrument);
        }

        for (Playable playable : playables) {
            tune(playable);
        }


    }


}
