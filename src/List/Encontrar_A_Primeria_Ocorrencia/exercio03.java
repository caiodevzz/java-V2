package List.Encontrar_A_Primeria_Ocorrencia;

import java.util.ArrayList;
import java.util.List;

public class exercio03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Caio");
        nomes.add("Cu");
        nomes.add("Java");
        nomes.add("Bleach");
        nomes.add("Deah note");
        nomes.add("Olhos");
        nomes.add("Black");

        String result = nomes.stream().filter(x -> x.length() > 5).findFirst().orElse(null);

        System.out.println(result);

    }
}
