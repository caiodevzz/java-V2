package List.exerciosRemove;

import java.util.ArrayList;
import java.util.List;

public class exercio07 {
    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();

        numeros.add(83.43);
        numeros.add(8.63);
        numeros.add(4.43);
        numeros.add(3.93);
        numeros.add(2.43);

        numeros.removeIf(x -> x <= 5.90);

        System.out.println(numeros);
    }
}
