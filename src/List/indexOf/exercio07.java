package List.indexOf;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class exercio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos numeros voce vai digitar ? ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " numero");
            int numero1 = sc.nextInt();

            numeros.add(numero1);
        }

        System.out.println("----LISTA DE NUMEROS----");
        for (int v : numeros) {
            System.out.println(v);
        }

        System.out.println("--------------------------");

        System.out.println("Digite um numero que voce deseja para ver em qual posicao ele esta: ");

        int numero2 = sc.nextInt();

        int posicao = numeros.indexOf(numero2);

        if (posicao == -1) {
            System.out.println("Numero nao existe na lista.");
        } else {
            System.out.println("O seu numero esta na posicao: " + posicao);
        }

        sc.close();
    }
}
