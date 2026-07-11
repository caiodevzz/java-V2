package List.exerciosRemove;

import java.util.ArrayList;
import java.util.List;

public class exercio11 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("abacate");
        stringList.add("estado unidos");
        stringList.add("olho");
        stringList.add("oval");
        stringList.add("salgado");
        stringList.add("batata");

        stringList.removeIf(x -> x.contains("e"));

        System.out.println(stringList);
    }
}
