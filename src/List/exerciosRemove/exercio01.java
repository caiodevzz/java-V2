package List.exerciosRemove;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exercio01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Caio");
        nomes.add("Marcos");
        nomes.add("Mateus");
        nomes.add("Dantas");
        nomes.add("Silva");

        System.out.println("LISTA");
        for (String x : nomes) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        nomes.remove("Mateus");

        System.out.println("LISTA ATUALIZADA");
        for (String c : nomes) {
            System.out.println(c);
        }
    }
}
