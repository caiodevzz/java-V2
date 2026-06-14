package exerciosP2;

import java.util.Scanner;

public class exercio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar ? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length ; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length ; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println();

        int soma = 0;

        for (int i = 0; i < vect.length ; i++) {
            soma += vect[i];
        }

        System.out.println("SOMA = " + soma);

        double media = soma / n;

        System.out.println("MEDIA = " + media);
    }
}
