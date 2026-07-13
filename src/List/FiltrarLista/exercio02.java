package List.FiltrarLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exercio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("----Verificador de numeros pares e impares----");
        System.out.print("Quantos numeros voce vai digitar ? ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " numero");

            int numero1 = sc.nextInt();

            numeros.add(numero1);
        }

        System.out.println("----------------Numeros Pares----------------");

        List<Integer> verificador = numeros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        for (int x : verificador) {
            System.out.println(x);
        }

        sc.close();
    }
}
