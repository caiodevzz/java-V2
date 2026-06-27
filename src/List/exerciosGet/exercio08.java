package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;

public class exercio08 {
    public static void main(String[] args) {
        List<String> letras = new ArrayList<>();

        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");

       String let1 = letras.get(1);
       String let2 = letras.get(3);

       letras.set(1, let2);
       letras.set(3, let1);

       for (String x : letras) {
           System.out.println(x);
       }
    }
}
