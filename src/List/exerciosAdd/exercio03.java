package List.exerciosAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crie uma lista de frutas e adicione "Maçã", "Banana" e "Laranja". Depois, insira "Uva" na posição 2.

public class exercio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomesFrutas = new ArrayList<>();

        System.out.print("Quantas frutas voce vai adicionar ? ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " nome da fruta");

            String nome = sc.next();

            nomesFrutas.add(nome);
        }

        System.out.println("Adicione qualquer outra fruta em qualquer posiçao: ");
        System.out.print("Posiçao: ");
        int posicao = sc.nextInt();
        System.out.print("Fruta:");
        String fruta = sc.next();

        nomesFrutas.add(posicao, fruta);

        System.out.println("----LISTA DE FRUTAS----");

        for (String x : nomesFrutas) {
            System.out.println(x);
        }

        sc.close();
    }
}
