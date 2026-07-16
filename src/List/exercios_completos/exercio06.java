package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio06 {
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();

        idades.add(89);
        idades.add(10);
        idades.add(17);
        idades.add(18);
        idades.add(22);
        idades.add(9);

        idades.add(1, 67);

        System.out.println(idades.size());

        System.out.println(idades.get(5));

        idades.remove(Integer.valueOf(22));

        idades.remove(2);

        idades.removeIf(x -> x < 18);

        System.out.println(idades.indexOf(89));
        System.out.println(idades.lastIndexOf(89));

        List<Integer> result1 = idades.stream().filter(x -> x > 21).collect(Collectors.toList());

        System.out.println(result1);

        Integer result2 = idades.stream().filter(x -> x > 21).findFirst().orElse(null);
        System.out.println(result2);
    }
}
