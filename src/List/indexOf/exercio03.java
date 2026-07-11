package List.indexOf;

import java.util.ArrayList;
import java.util.List;

public class exercio03 {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();

        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Verde");

        System.out.println("posicao do vermelho: " + cores.indexOf("Vermelho"));
    }
}
