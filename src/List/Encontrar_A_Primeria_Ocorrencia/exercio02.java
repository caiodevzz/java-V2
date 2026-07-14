package List.Encontrar_A_Primeria_Ocorrencia;

import java.util.ArrayList;
import java.util.List;

public class exercio02 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(2);
        numeros.add(7);
        numeros.add(23);
        numeros.add(17);

        Integer pares = numeros.stream().filter(x -> x % 2 == 0).findFirst().orElse(null);

        System.out.println(pares);
    }
}
