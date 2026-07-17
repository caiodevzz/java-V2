package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio10 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        numeros.add(7, 78);

        System.out.println(numeros.size());

        System.out.println(numeros.get(4));

        numeros.remove(Integer.valueOf(3));

        numeros.removeIf(x -> x % 3 == 0);

        System.out.println(numeros.indexOf(5));
        System.out.println(numeros.lastIndexOf(6));

        List<Integer> result1 = numeros.stream().filter(x -> x > 10).collect(Collectors.toList());

        System.out.println(result1);

        Integer result2 = numeros.stream().filter(x -> x > 10).findFirst().orElse(null);

        System.out.println(result2);
    }
}
