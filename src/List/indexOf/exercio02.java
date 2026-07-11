package List.indexOf;

import java.util.ArrayList;
import java.util.List;

public class exercio02 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(20);

        System.out.println("Posicao do numero 20: " + numeros.indexOf(20));
        System.out.println("Ocorrencia do numero 20: " + numeros.lastIndexOf(20));
    }
}
