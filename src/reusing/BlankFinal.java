package reusing;

import design.factory.Xiaomi;

import java.util.Base64;

class People{
    private int i;

    People(int i) {
        this.i = i;
        System.out.println("new People :" + i);
    }

    @Override
    public String toString() {
        return "People{" +
                "i=" + i +
                '}';
    }
}


public class BlankFinal {

    private final int i = 0;
    private final int j;  //空白final,允许赋值,而且后期无法改变
    private final People p;

    public BlankFinal() {
        j = 1;
        p = new People(1);
    }

    public BlankFinal(int j) {
        this.j = j;
        p = new People(j);
    }

    @Override
    public String toString() {
        return "BlankFinal{" +
                "i=" + i +
                ", j=" + j +
                ", p=" + p +
                '}';
    }

    public static void main(String[] args) {

        System.out.println(new BlankFinal());

        System.out.println(new BlankFinal(12));

    }




}
