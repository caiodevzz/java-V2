package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio03 {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();

        produtos.add("Bola");
        produtos.add("Tv");
        produtos.add("Mouse");
        produtos.add("Monitor");
        produtos.add("Cabo de Internet");
        produtos.add("Teclado");
        produtos.add(2, "Notebook");

        System.out.println(produtos.size());

        System.out.println(produtos.get(2));

        produtos.remove("Mouse");

        produtos.remove(3);

        produtos.removeIf(x -> x.charAt(0) == 'C');

        System.out.println(produtos.indexOf("Teclado"));

        System.out.println(produtos.lastIndexOf("Monitor"));

        List<String> result1 = produtos.stream().filter(x -> x.length() > 6).collect(Collectors.toList());

        System.out.println(result1);

        String resul2 = produtos.stream().filter(x -> x.length() > 6).findFirst().orElse(null);

        System.out.println(resul2);
    }
}
