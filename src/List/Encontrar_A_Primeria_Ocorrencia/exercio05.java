package List.Encontrar_A_Primeria_Ocorrencia;

import java.util.ArrayList;
import java.util.List;

public class exercio05 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Manga");
        nomes.add("Java");
        nomes.add("C++");
        nomes.add("Python");
        nomes.add("Arroz");

        String result = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(result);
    }
}
