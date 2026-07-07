package List.exerciosAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crie uma lista de cidades e adicione 4 cidades. Depois, insira uma nova cidade na primeira posição (índice 0).

public class exercio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cidades = new ArrayList<>();

        System.out.println("Quantas cidades voce vai adicionar ?");

        int nCidades = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nCidades ; i++) {
            System.out.println("Digite a " + (i + 1) + " cidade");
            String cidade = sc.nextLine();

            cidades.add(cidade);
        }

        System.out.println("Adicione qualquer outra cidade em qualquer posicao: ");
        System.out.print("Cidade: ");
        String cidade = sc.nextLine();
        System.out.print("Posicao: ");
        int posicao = sc.nextInt();

        cidades.add(posicao, cidade);

        System.out.println("Lista de cidades:");

        for (String x : cidades) {
            System.out.println(x);
        }

        sc.close();
    }
}
