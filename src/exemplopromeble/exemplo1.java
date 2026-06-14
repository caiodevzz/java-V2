package exemplopromeble;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura ");
        int n = sc.nextInt();

        double[] alturaN = new double[n];

        for (int i = 0; i < n ; i++) {
            alturaN[i] = sc.nextDouble();
        }

        double soma = 0.0;

        for (int i = 0; i < n ; i++) {
            soma += alturaN[i];
        }

        double medi = soma / n;

        System.out.printf("Media: %.2f%n",  medi);

    }
}
