package List.exerciosAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaCores = new ArrayList<>();

        System.out.print("Quantas cores voce vai digitar ? ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite a " + (i + 1) + " cor");

            String cores = sc.next();

            listaCores.add(cores);
        }

        System.out.println("Adcione qualquer cor em qualquer posiçao:");
        System.out.print("Cor: ");
        String cor = sc.next();
        System.out.print("Posicao: ");
        int posicao = sc.nextInt();

        listaCores.add(posicao, cor);

        System.out.println("----LISTA CORES----");

        for (String x : listaCores) {
            System.out.println(x);
        }
        sc.close();
    }
}
