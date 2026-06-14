package exercios;

import java.util.Scanner;

public class exercio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n ; i++) {
            vect[i] = sc.nextInt();
        }

        System.out.print("Numeros pares: ");

        for (int i = 0; i < n ; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
            }
        }
    }
}
