package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Quantas pessoas voce vai digitar ? ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1));
            System.out.print("nome: ");

            String nome = sc.next();
            nomes.add(nome);
        }

        System.out.print("Primeiro elemento: ");
        System.out.println(nomes.get(0));
        System.out.print("Ultimo elemento: ");
        System.out.println(nomes.get(nomes.size() -1));
    }
}
