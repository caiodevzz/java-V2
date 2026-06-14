package exercios;

import java.util.Scanner;

public class EXERCIO5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n ; i++) {
            vect[i] = sc.nextInt();
        }
        System.out.print("Original: ");

        for (int i = 0; i < n ; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println();
        System.out.print("Invertido: ");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(vect[i] + " ");
        }
    }
}
