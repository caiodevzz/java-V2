package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio04 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(9);
        numeros.add(9);
        numeros.add(4334);
        numeros.add(54);
        numeros.add(6);
        numeros.add(6);
        numeros.add(5);
        numeros.add(2);

        numeros.add(3, 4);

        System.out.println(numeros.size());

        System.out.println(numeros.get(3));

        numeros.remove(Integer.valueOf(6));

        numeros.remove(1);

        numeros.removeIf(x -> x % 2 == 0);

        System.out.println(numeros.indexOf(6));
        System.out.println(numeros.lastIndexOf(6));

        List<Integer> result1 = numeros.stream().filter(x -> x > 50).collect(Collectors.toList());

        System.out.println(result1);

        Integer result2 = numeros.stream().filter(x -> x > 50).findFirst().orElse(null);

        System.out.println(result2);
    }
}
