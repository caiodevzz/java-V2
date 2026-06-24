package List.exerciosGet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        System.out.print("Quantos numeros voce vai digitar ? ");

        int numero = sc.nextInt();

        for (int i = 0; i < numero ; i++) {
            System.out.println("Digite o nome do: " + (i +1));
            String nomesc = sc.next();

            nomes.add(nomesc);
        }

        System.out.println(nomes.get(0));
        System.out.println(nomes.size() - 1);
    }
}
