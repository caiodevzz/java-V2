package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio02 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Caio");
        nomes.add("Mateus");
        nomes.add("Silva");
        nomes.add("Jorge");
        nomes.add("Dantas");
        nomes.add("Ferreira");
        nomes.add("Joao");
        nomes.add("Maria");

        nomes.add(1, "Foda");

        System.out.println(nomes.size());

        System.out.println(nomes.get(4));

        nomes.remove(2);

        nomes.removeIf(x -> x.equals("Caio"));

        nomes.removeIf(x -> x.length() < 5);

        System.out.println(nomes.indexOf("Maria"));

        System.out.println(nomes.lastIndexOf("Joao"));

        List<String> result = nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        System.out.println(result);

        String reult1 = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(reult1);
    }
}
