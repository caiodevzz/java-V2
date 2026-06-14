package exerciosP2;

import java.util.Scanner;

public class exercio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas ? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n ; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (1 + i) + " pessoa");

            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();

        }

        double somaAlutra = 0;
        for (int i = 0; i < n ; i++) {
            somaAlutra += altura[i];
        }

        double mediaAltura = somaAlutra / n;
        System.out.printf("Altura media: %.2f %n", mediaAltura);

        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                contador++;
            }
        }

        double menores = ((double)contador / n) * 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", menores);
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }
        sc.close();
    }
}
