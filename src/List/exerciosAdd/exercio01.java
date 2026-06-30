package List.exerciosAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crie uma ArrayList<String> e adicione 5 nomes usando add(obj). Depois, imprima todos os nomes.

public class exercio01 {
    public static void main(String[] args) {
         List<String> nomes = new ArrayList<>();
         Scanner sc = new Scanner(System.in);

         System.out.print("Quantos nomes voce vai adiconar na lista ? ");
         int n = sc.nextInt();

         for (int i = 0; i < n ; i++) {
             System.out.println("Digite o " + (i + 1) + " nome");
             String nome = sc.next();

             nomes.add(nome);
         }

         System.out.println("------LISTA DOS NOMES------");

         for (String x : nomes) {
             System.out.println(x);
         }

         sc.close();
    }
}
