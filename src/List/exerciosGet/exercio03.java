package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

    System.out.print("Digite os numeros de nomes que voce vai adicionar: ");

    int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i <  n ; i++) {
            System.out.println("Digite o " + (i +1) + " nome");

            String nome = sc.nextLine();
            nomes.add(nome);
        }


        System.out.println("Lista de todos os nomes:");

        for (int i = 0; i < n; i++) {
            System.out.println(nomes.get(i));
        }

        sc.close();
    }
}
