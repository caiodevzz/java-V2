package List.indexOf;

import java.util.ArrayList;
import java.util.List;

public class exercio01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Caio");
        nomes.add("Mateus");
        nomes.add("Dantas");
        nomes.add("Arnaldo");
        nomes.add("Ana");

        System.out.println("Posicao de Ana: " + nomes.indexOf("Ana"));
        System.out.println("Ultima vez que Ana pareceu: " + nomes.lastIndexOf("Ana"));
    }
}
