package List.exerciosRemove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> palavras = new ArrayList<>();

        System.out.print("Digite quantas palavras voce vai colocar na lista: ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite a " + (i + 1) + " palavra");

            String palavra1 = sc.next();
            palavras.add(palavra1);
        }

        System.out.println("----LISTA SEM REMOÇAO----");
        for (String x : palavras) {
            System.out.println(x);
        }

        System.out.println("------------------------------------");

        palavras.removeIf(x -> x.length() > 5);

        System.out.println("----REMOÇAO DAS PALAVRAS COM MAIS DE 5 LETRAS----");

        for (String v : palavras) {
            System.out.println(v);
        }

        sc.close();
    }
}
