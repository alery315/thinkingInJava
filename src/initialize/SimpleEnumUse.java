package initialize;

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}


public class SimpleEnumUse {

    public static void main(String[] args) {

        Spiciness howHot = Spiciness.MEDIUM;

        System.out.println(howHot);

        for (Spiciness value : Spiciness.values()) {
            System.out.println(value + " : " + value.ordinal());
        }

    }


}
