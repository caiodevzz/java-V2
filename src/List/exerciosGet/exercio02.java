package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numero = new ArrayList<>();

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " numero");

           int a = sc.nextInt();

           numero.add(a);
        }

        System.out.print("Digite um indexe agora: ");

        int indexe = sc.nextInt();

        System.out.println(numero.get(indexe));

        sc.close();
    }
}
