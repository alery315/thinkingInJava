package polymorphism;

class Instrument {

    public static int i = 100;

    public void play(Note note) {
        System.out.println("Instrument play();");
    }
}

class Wind extends Instrument {

    @Override
    public void play(Note note) {
        System.out.println("wind play() : " + note);
    }
}

class Brass extends Instrument {

    @Override
    public void play(Note note) {
        System.out.println("brass play() : " + note);
    }
}

public class Music {


    public static void tune(Instrument instrument) {
        instrument.play(Note.C_SHARP);
    }


    public static void main(String[] args) {

        Wind wind = new Wind();
        tune(wind);

        Brass brass = new Brass();
        tune(brass);

    }


}
