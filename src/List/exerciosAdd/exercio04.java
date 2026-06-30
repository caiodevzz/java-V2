package List.exerciosAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crie uma lista vazia de Double. Adicione 3 valores decimais usando add(obj) e imprima o tamanho da lista.

public class exercio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        numeros.add(1.32);
        numeros.add(3.44);
        numeros.add(6.34);
        numeros.add(7.82);
        numeros.add(8.52);

        System.out.println("Tamanho da lista: " + numeros.size());

        sc.close();
    }
}
