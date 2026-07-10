package List.exerciosRemove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Quantos nomes voce vai digitar ? ");

        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " nome");
            String nome = sc.nextLine();

            nomes.add(nome);
        }

        System.out.println("----LISTA SEM REMOÇAO----");
        for (String x : nomes) {
            System.out.println(x);
        }

        System.out.println("---------------------------------");

        System.out.println("Remoaçao dos nomes que começam por A");

        nomes.removeIf(x -> x.charAt(0) == 'A');

        System.out.println("----LISTA ATUALIZADA----");
        System.out.println(nomes);

        sc.close();
    }
}
