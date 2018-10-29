package reusing;


class Amphibian {

    private String s;

    Amphibian(String s) {
        this.s = s;
    }

    public void doSomething() {
        System.out.println("Amphibian : " + getS());
    }

    public String getS() {
        return s;
    }
}


public class Frog extends Amphibian {

    Frog(String s) {
        super(s);
    }

    public void doSomething() {
        System.out.println("Frog : " + getS());
    }

    public static void main(String[] args) {

        Amphibian amp = new Frog("frog");
        amp.doSomething();

        if (amp instanceof Amphibian) {
            System.out.println("ok");
        }

        if (amp instanceof Frog) {
            System.out.println("f ok");
        }
    }

}
