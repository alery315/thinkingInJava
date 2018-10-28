package initialize;

public class TerminationCondition {


    public static void main(String[] args) {

        Book novel = new Book(true);

        novel.checkIn();

        //new Book(true);


        System.gc();

    }

}
