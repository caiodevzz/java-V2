package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;

public class exercio06 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("tamanho da lista: " + numeros.size());
        System.out.println("elemento central da lista: " + numeros.get(2));
        System.out.println();
    }
}
