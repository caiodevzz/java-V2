package List.FiltrarLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio06 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(10);
        numeros.add(50);
        numeros.add(84);
        numeros.add(38);
        numeros.add(4);

        List<Integer> verificador = numeros.stream().filter(x -> x >= 10 && x <= 50).collect(Collectors.toList());

        for (int x : verificador) {
            System.out.println(x);
        }

    }
}
