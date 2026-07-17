package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio08 {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(7.9);
        notas.add(9.0);
        notas.add(6.8);
        notas.add(2.8);
        notas.add(5.4);
        notas.add(8.3);
        notas.add(3.9);
        notas.add(3.8);
        notas.add(3.7);
        notas.add(3.4);
        notas.add(9.8);

        notas.add(0, 5.9);

        System.out.println(notas.size());

        System.out.println(notas.get(4));

        notas.remove(3.9);

        notas.remove(2);

        notas.removeIf(x -> x > 6);

        System.out.println(notas.indexOf(10));
        System.out.println(notas.lastIndexOf(8));

        List<Double> result1 = notas.stream().filter(x -> x > 7).collect(Collectors.toList());

        System.out.println(result1);

        Double result2 = notas.stream().filter(x -> x > 7).findFirst().orElse(null);

        System.out.println(result2);

    }
}
