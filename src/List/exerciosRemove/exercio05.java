package List.exerciosRemove;

import java.util.ArrayList;
import java.util.List;

public class exercio05 {
    public static void main(String[] args) {
        List<Character>characterList = new ArrayList<>();

        characterList.add('A');
        characterList.add('C');
        characterList.add('G');
        characterList.add('F');
        characterList.add('H');

        characterList.removeIf(x -> x == 'A');

        for (char c : characterList) {
            System.out.println(c);
        }
    }
}
