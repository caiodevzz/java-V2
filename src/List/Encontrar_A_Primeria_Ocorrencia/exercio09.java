package List.Encontrar_A_Primeria_Ocorrencia;

import java.util.ArrayList;
import java.util.List;

public class exercio09 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(0);
        numeros.add(10);
        numeros.add(90);
        numeros.add(40);
        numeros.add(4);

        int result = numeros.stream().filter(x -> x % 2 == 0 && x > 20).findFirst().orElse(0);

        System.out.println(result);
    }
}
