package exerciosP2;

import java.util.Scanner;

public class exercio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar ? ");

        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n ; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int posicao = 0;
        for (int i = 1; i < n ; i++) {
            if (idade[i] > idade[posicao]) {
              posicao = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[posicao]);
    }
}
