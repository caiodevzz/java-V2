package List.exerciosRemove;

import java.util.ArrayList;
import java.util.List;

public class exercio04 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(90);
        integers.add(340);
        integers.add(540);
        integers.add(9);
        integers.add(5);
        integers.add(9650);
        integers.add(435);
        integers.add(9054);
        integers.add(657);

        integers.removeIf(x -> x % 2 == 0);

        System.out.println(integers);
    }
}
