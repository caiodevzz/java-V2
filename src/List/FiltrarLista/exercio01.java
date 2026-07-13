package List.FiltrarLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class exercio01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(43);
        numeros.add(7650);
        numeros.add(0);
        numeros.add(8);


        List<Integer> result = numeros.stream().filter(x -> x > 10).collect(Collectors.toList());

        for (int x : result) {
            System.out.println(x);
        }
    }
}
