package List.Encontrar_A_Primeria_Ocorrencia;

import java.util.ArrayList;
import java.util.List;

public class exercio01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        Integer result = numeros.stream().filter(x -> x > 10).findFirst().orElse(null);

        System.out.println(result);
    }
}
