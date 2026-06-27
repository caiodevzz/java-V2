package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;

public class exercio11 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        int op1 = numbers.get(0);
        int op2 = numbers.get(4);

        double media = (double) (op1 + op2) / 2;

        System.out.println(media);
    }
}
