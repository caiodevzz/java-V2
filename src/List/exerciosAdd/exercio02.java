package List.exerciosAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos numeros voce vai adicionar ? ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " numero");

            int numero = sc.nextInt();

            numeros.add(numero);
        }

        System.out.println("Adicione qualquer numero na posiçao 1: ");

        int opc = 1;

        int numroqualquer = sc.nextInt();

        numeros.add(opc, numroqualquer);

        System.out.println("Lista de numeros:");
        for (int x : numeros) {
            System.out.println(x);
        }

        sc.close();
    }
}
