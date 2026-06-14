package exercios;

import java.util.Scanner;

public class exercio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n ; i++) {
            vect[i] = sc.nextInt();
        }

        int soma = 0;

        for (int i = 0; i < n ; i++) {
            soma += vect[i];
        }

        System.out.println("Soma: " + soma);
    }
}
