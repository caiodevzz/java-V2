package exercios.POO.test;

import exercios.POO.domin.Produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite quantos produtos voce vai adicionar: ");

        int numero = sc.nextInt();
        Produto[] produto = new Produto[numero];
        for (int i = 0; i < numero ; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();
            produto[i] = new Produto(nome, preco, quantidade);

        }

        double soma = 0;
        for (int i = 0; i < numero ; i++) {
            soma += produto[i].getPreco();
        }

        double media = soma / numero;

        System.out.printf("Media dos preços: %.2f%n", media);

        sc.close();
    }
}
