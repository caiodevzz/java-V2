package List.Encontrar_A_Primeria_Ocorrencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        numeros.add(19);
        numeros.add(32);
        numeros.add(34);
        numeros.add(4);
        numeros.add(-19);

        Integer result = numeros.stream().filter(x -> x % 2 != 0 && x > numero).findFirst().orElse(null);

        System.out.println(result);

        sc.close();
    }
}
