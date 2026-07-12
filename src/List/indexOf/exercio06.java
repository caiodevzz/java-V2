package List.indexOf;

import java.util.ArrayList;
import java.util.List;

public class exercio06 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Java");
        palavras.add("Python");
        palavras.add("Java");
        palavras.add("C++");
        palavras.add("Java");

        System.out.println("Primeira ocorrencia da palavara Java: " + palavras.indexOf("Java"));
        System.out.println("Ultima ocorrencia da palavra Java: " + palavras.lastIndexOf("Java"));
    }
}
