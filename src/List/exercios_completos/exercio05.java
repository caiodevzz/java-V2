package List.exercios_completos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exercio05 {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(1650.00);
        doubleList.add(2000.00);
        doubleList.add(4000.00);
        doubleList.add(3000.00);
        doubleList.add(5000.00);
        doubleList.add(6000.00);
        doubleList.add(2500.00);

        doubleList.add(2, 4500.00);

        System.out.println(doubleList.size());

        System.out.println(doubleList.get(3));

        doubleList.remove(5000.00);

        doubleList.remove(0);

        doubleList.removeIf(x -> x < 1500.00);

        System.out.println(doubleList.indexOf(2000.00));
        System.out.println(doubleList.lastIndexOf(3000.00));

        List<Double> result1 = doubleList.stream().filter(x -> x > 2500).collect(Collectors.toList());

        System.out.println(result1);

        Double result2 = doubleList.stream().filter(x -> x > 2500.00).findFirst().orElse(null);

        System.out.println(result2);
    }
}
