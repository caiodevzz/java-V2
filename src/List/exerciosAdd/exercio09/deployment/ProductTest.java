package List.exerciosAdd.exercio09.deployment;

import List.exerciosAdd.exercio09.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.println("BEM VINDO AO SUMERCADO TOP");
        System.out.print("Quantos produtos voce vai digitar ? ");

        int n = sc.nextInt();


        for (int i = 0; i < n ; i++) {
            sc.nextLine();
            System.out.println("Digite o " + (i + 1) + " produto");

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            productList.add(new Product(nome, quantidade, preco));
        }

        System.out.println("adicione mais alguma coisa, pode ser em qualquer posiçao");

        System.out.print("Nome: ");
        String produto = sc.next();
        System.out.print("Preço: ");
        int posicao = sc.nextInt();

        productList.add(posicao, new Product(produto));

        System.out.println("-----LISTA-----");
        for (Product x : productList) {
            System.out.println(x);
        }

        sc.close();
    }
}
