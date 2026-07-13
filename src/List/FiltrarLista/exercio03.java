package List.FiltrarLista;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio03 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(182);
        integerList.add(12);
        integerList.add(-2);
        integerList.add(42);
        integerList.add(-3);
        integerList.add(-112);
        integerList.add(2984);

        List<Integer> numerosNegativos = integerList.stream().filter(x -> x < -0).collect(Collectors.toList());

        for (int z : numerosNegativos) {
            System.out.println(z);
        }
    }
}
