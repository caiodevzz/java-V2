package exerciosP2;

import java.util.Scanner;

public class exercio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar ? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length ; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("MAIOR VALOR = ");
        for (int i = 0; i < vect.length ; i++) {
            if (vect[i] >= 14.0) {
                System.out.print(vect[i] + " ");
            }
        }

        System.out.println();

        int posicao = 0;
        for (int i = 0; i < vect.length ; i++) {
            if (vect[i] > vect[posicao]) {
               posicao = i;
            }
        }

        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

        sc.close();
    }
}
