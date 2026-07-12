package List.indexOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio08 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite tres numeros: ");

        int n = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        numeros.add(n);
        numeros.add(c);
        numeros.add(d);

        System.out.print("Digite um numero que voce queira ver a posicao dele: ");
        int numero1 = sc.nextInt();

        int posicao1 = numeros.indexOf(numero1);
        int posicao2 = numeros.lastIndexOf(numero1);

        if (posicao1 == -1) {
            System.out.println("Numero nao existe na lista");
        }else {
            System.out.println("Posicao do seu numero em primeira ocorrencia: " + posicao1);
            System.out.println("Posicao do seu numero em segunda ocorrencia: " + posicao2);
        }

        sc.close();
    }
}
