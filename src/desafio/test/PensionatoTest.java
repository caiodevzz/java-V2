package desafio.test;

import desafio.domin.Pensionato;

import java.util.Scanner;

public class PensionatoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Pensionato[] pensionatoes = new Pensionato[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Quarto # " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            Pensionato pensionato1 = new Pensionato(email, name);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10 ; i++) {
            if (pensionatoes[i] != null) {
                System.out.println(i + ": " + pensionatoes[i]);
            }
        }

        sc.close();
    }
}
