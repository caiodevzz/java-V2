package List.exerciosAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Quantos numeros voce vai adiconar ? ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " numero");

            int numero = sc.nextInt();

            if (numero > 0) {
                listaNumeros.add(numero);
            }
        }

        System.out.println("Adicione qualquer numero na posiçao 3");

        int numero = sc.nextInt();
        listaNumeros.add(3, numero);

        System.out.println("----LISTA DE NUMEROS----");
        for (int x : listaNumeros) {
            System.out.println(x);
        }

        sc.close();
    }
}
