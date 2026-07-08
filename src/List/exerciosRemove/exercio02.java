package List.exerciosRemove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numerosList = new ArrayList<>();

        System.out.print("Quantos numeros voce vai adicionar ? ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            int numero = sc.nextInt();

            numerosList.add(numero);
        }

        System.out.println("LISTA ANTES DA REMOÇAO DE ALGUM ELEMENTO");
        for (int x : numerosList) {
            System.out.println(x);
        }

        System.out.println("-----------------------");

        System.out.println("Remova um numero usando a posicaço dele:");

        System.out.print("Posicao: ");
        int posicao = sc.nextInt();


        numerosList.remove(posicao);

        System.out.println("----------LISTA ATUALIZADA----------");
        for (int v : numerosList) {
            System.out.println(v);
        }

        sc.close();
    }
}
