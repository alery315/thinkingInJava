package access;

import static access.Print.*;
import static access.Range.*;

public class TestPrint {


    public static void main(String[] args) {

        println("kiasd" + 12);

        println(12.213 + 12);

        println(12L);

        println(123124 + new String("213"));


        for (int i : range(12)) {
            print(i + " ");
        }

        println();

        for (int i : range(12, 17)) {
            print(i + " ");
        }

        println();

        for (int i : range(12, 31, 3)) {
            print(i + " ");
        }




    }

}
