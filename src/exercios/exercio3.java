package exercios;

import java.util.Scanner;

public class exercio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n ; i++) {
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            if (vect[i] >= 20 && vect[i] >= 30) {
                System.out.println("Maior: " + vect[i]);
            } else if (vect[i] <= 2 || vect[i] <= 1) {
                System.out.println("Menor: " + vect[i]);
            }
        }
    }
}
