package exercios;

import java.util.Scanner;

public class exercio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vect = new int[n];


        for (int i = 0; i < n ; i++) {
            vect[i] = sc.nextInt();
        }

        System.out.print("Valores digitados: ");

        for (int i = 0; i <n ; i++) {
            System.out.print(vect[i] + " ");
        }


    }
}

