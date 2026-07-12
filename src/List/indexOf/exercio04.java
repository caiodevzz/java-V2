package List.indexOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.print("Quantos nomes voce vai digitar ? ");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " nome");
            String nome = sc.nextLine();

            nomes.add(nome);
        }

        System.out.println("----LISTA----");
        for (String x : nomes) {
            System.out.println(x);
        }

        System.out.println("----------------------------------");

        System.out.println("Digite um nome que vc gostaria de ver a posiçao dele: ");
        String name = sc.nextLine();

        int posicao = nomes.indexOf(name);

        if (posicao ==  -1) {
            System.out.println("Posicao nao encontrada");
        } else {
            System.out.println("Posicao do nome: " + nomes.indexOf(name));
        }

        sc.close();
    }
}
