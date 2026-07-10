package List.exerciosRemove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cidades = new ArrayList<>();

        System.out.print("quantas cidades voce vai falar ? ");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite a " + (i + 1) + " cidade");
            String cidade = sc.nextLine();

            cidades.add(cidade);
        }

        System.out.println("Litas:");
        for (String x : cidades) {
            System.out.println(x);
        }

        System.out.println("-----------------------------");
        System.out.println("Remova duas cidades usando o nome e a posicçao");

        System.out.print("Posicao: ");
        int posicao = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String cidade2 = sc.nextLine();

        cidades.remove(cidade2);
        cidades.remove(posicao);

        System.out.println("LISTA ATUALIZADA");
        for (String v :cidades) {
            System.out.println(v);
        }

        sc.close();
    }
}
