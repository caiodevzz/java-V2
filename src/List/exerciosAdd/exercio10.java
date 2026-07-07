package List.exerciosAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> characters = new ArrayList<>();

        System.out.println("Quantas caracteres voce vai digitar ? ");

        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite a " + ( i + 1) + " cactere");
            char cacter = sc.next().charAt(0);

            characters.add(cacter);
        }

        System.out.println("Por favor insira mais uma cactere, pode sem em qualquer posicao");
        System.out.print("Cactere: ");
        char c = sc.next().charAt(0);
        System.out.print("Posicao: ");
        int posicao = sc.nextInt();

        characters.add(posicao, c);

        System.out.println("----LISTA----");
        for (char x : characters) {
            System.out.println(x);
        }


        sc.close();
    }
}
