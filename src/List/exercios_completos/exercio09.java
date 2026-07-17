package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio09 {
    public static void main(String[] args) {
        List<Character> letras = new ArrayList<>();

        letras.add('J');
        letras.add('A');
        letras.add('M');
        letras.add('C');
        letras.add('B');
        letras.add('A');
        letras.add('C');
        letras.add('z');
        letras.add('O');

        letras.add(2, 'H');

        System.out.println(letras.size());

        System.out.println(letras.get(3));

        letras.remove(Character.valueOf('O'));

        letras.remove(0);

        letras.removeIf(x -> x < 'm');

        System.out.println(letras.indexOf('a'));
        System.out.println(letras.lastIndexOf('z'));

        List<Character> result1 = letras.stream().filter(x -> x > 'm').collect(Collectors.toList());

        System.out.println(result1);

        Character result2 = letras.stream().filter(x -> x > 'm').findFirst().orElse(null);

        System.out.println(result2);
    }
}
