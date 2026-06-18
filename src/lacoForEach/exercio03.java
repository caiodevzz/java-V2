package lacoForEach;

public class exercio03 {
    public static void main(String[] args) {

        String[] frutas = {"maça", "banana", "uva"};

        for (int i = 0; i < frutas.length ; i++) {
            System.out.println((i + 1) + " - " + frutas[i]);
        }

        for (String frut : frutas) {
            System.out.println(frut);
        }
    }
}
