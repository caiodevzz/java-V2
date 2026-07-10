package List.exerciosRemove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> frutas = new ArrayList<>();

        System.out.print("Quantas frutas voce vai digitar ? ");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite a " + (i + 1) + " fruta");
            String frut = sc.nextLine();

            frutas.add(frut);
        }

        System.out.println("----LISTA SEM REMOÇAO----");
        for (String x : frutas) {
            System.out.println(x);
        }

        System.out.println("--------------------------");
        System.out.println("Remova qualquer fruta da sua lista, so digitar no nome.");

        System.out.print("Fruta: ");
        String frut2 = sc.next();

        frutas.remove(frut2);

        System.out.println("----LISTA COM REMOÇAO----");
        for (String v : frutas) {
            System.out.println(v);
        }


        sc.close();
    }
}
