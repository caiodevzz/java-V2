package List.indexOf;

import java.util.ArrayList;
import java.util.List;

public class exercio05 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(783);
        numeros.add(783);
        numeros.add(74);
        numeros.add(645);
        numeros.add(776);

        System.out.println(numeros.indexOf(783)); // retorna (a primeira ocorrência)
        System.out.println(numeros.lastIndexOf(783)); // retorna (a última or ocorrência)
    }
}
