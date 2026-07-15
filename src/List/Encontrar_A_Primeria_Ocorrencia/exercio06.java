package List.Encontrar_A_Primeria_Ocorrencia;

import java.util.ArrayList;
import java.util.List;

public class exercio06 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Algorithm");
        palavras.add("Rust");
        palavras.add("Java");
        palavras.add("Hi");
        palavras.add("Hello");
        palavras.add("no");

        String result = palavras.stream().filter(x -> x.toLowerCase().contains("java")).findFirst().orElse(null);

        System.out.println(result);
    }
}
