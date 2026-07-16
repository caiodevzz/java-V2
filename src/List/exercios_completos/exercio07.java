package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio07 {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>();

        cidades.add("itumbiara");
        cidades.add("Goiania");
        cidades.add("Rio de Janeiro");
        cidades.add("Nordeste");
        cidades.add("Sao Paulo");
        cidades.add("Brasilia");
        cidades.add("Rio Grande Do Sul");

        cidades.add(3, "Fortaleza");

        System.out.println(cidades.size());

        System.out.println(cidades.get(2));

        cidades.remove("Goiania");

        cidades.remove(1);

        cidades.removeIf(x -> x.length() < 6);

        System.out.println(cidades.indexOf("Sao Paulo"));

        System.out.println(cidades.lastIndexOf("Rio de Janeiro"));

        List<String> result1 = cidades.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        System.out.println(result1);

        String result2 = cidades.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(result2);
    }
}
