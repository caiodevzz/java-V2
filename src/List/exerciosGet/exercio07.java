package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;

public class exercio07 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(5);
        number.add(8);
        number.add(12);
        number.add(3);
        number.add(9);
        number.add(20);

        int m = 0;
        int b = 0;
        int c = 0;

          m += number.get(1);
          b += number.get(3);
          c += number.get(5);

          int soma = m += b+= c;


        System.out.println("resultado: " + soma);
    }
}
