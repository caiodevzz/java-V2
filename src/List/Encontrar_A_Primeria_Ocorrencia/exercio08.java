package List.Encontrar_A_Primeria_Ocorrencia;

import java.util.ArrayList;
import java.util.List;

public class exercio08 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        int result = numeros.stream().filter(x -> x > 5).findFirst().orElse(0);

        System.out.println(result);
    }
}
