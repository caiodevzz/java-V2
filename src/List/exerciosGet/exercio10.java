package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;

public class exercio10 {
    public static void main(String[] args) {
        List<String> letras = new ArrayList<>();

        letras.add("J");
        letras.add("A");
        letras.add("V");
        letras.add("A");

        System.out.print(letras.get(0) );
        System.out.print(letras.get(1) );
        System.out.print(letras.get(2) );
        System.out.print(letras.get(3) );
    }
}
