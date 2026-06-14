package exerciosP2;

import java.util.Scanner;

public class exercio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor ? ");

        int n = sc.nextInt();
        int[] vect = new int[n];
        int npares = 0;

        for (int i = 0; i < vect.length ; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int somaPares = 0;

        for (int i = 0; i < vect.length ; i++) {
            if (vect[i] % 2 == 0) {
                somaPares = somaPares + vect[i];
                npares++;
            }
        }

        if (npares == 0) {
            System.out.println("NEUNHUM NUMERO PAR");
        }else {
            double media = 0.0;

            media = (double) somaPares / npares;

            System.out.printf("MEDIA DOS PARRES = %.1f %n", media);
        }


        sc.close();
    }
}
