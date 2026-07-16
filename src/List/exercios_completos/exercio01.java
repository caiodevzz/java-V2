package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(10);
        numeros.add(12);
        numeros.add(99);
        numeros.add(540);
        numeros.add(876);
        numeros.add(20);
        numeros.add(0);
        numeros.add(999);
        numeros.add(83);

        numeros.add(2, 99);

        System.out.println(numeros.size());

        System.out.println(numeros.get(3));
        numeros.remove(Integer.valueOf(99));

        numeros.remove(0);

        numeros.removeIf(x -> x < 10);

        System.out.println(numeros.indexOf(20));
        System.out.println(numeros.lastIndexOf(20));

        List<Integer> result = numeros.stream().filter(x -> x > 15).collect(Collectors.toList());

        System.out.println(result);

        int num = numeros.stream().filter(x -> x > 15).findFirst().orElse(null);

        System.out.println(num);
    }
}
