package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;

public class exercio09 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(15);
        number.add(42);
        number.add(7);
        number.add(99);
        number.add(23);
        number.add(60);

       int a = number.get(0);
       int b = number.get(3);
       int c = number.get(5);

        if (b > a && b >= c) {
            System.out.println("A lista tem um numero muito alto");
        }else {
            System.out.println("Nao existe esse numero :(");
        }
    }
}
