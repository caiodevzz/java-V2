package List.FiltrarLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercio08 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(15);
        numeros.add(30);
        numeros.add(45);
        numeros.add(39);
        numeros.add(95);
        numeros.add(198);
        numeros.add(-1);

        List<Integer> verificador = numeros.stream().filter(x -> x % 3 == 0 && x % 5 == 0).collect(Collectors.toList());

        for (int x : verificador) {
            System.out.println(x);
        }
    }
}
