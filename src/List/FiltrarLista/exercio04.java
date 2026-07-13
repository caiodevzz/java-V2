package List.FiltrarLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio04 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Oi");
        palavras.add("Abacate");
        palavras.add("Morango");
        palavras.add("Java");
        palavras.add("Olho");
        palavras.add("Caio");

        List<String> verificador = palavras.stream().filter(x -> x.length() > 5).collect(Collectors.toList());

        for (String x : verificador) {
            System.out.println(x);
        }
    }
}
