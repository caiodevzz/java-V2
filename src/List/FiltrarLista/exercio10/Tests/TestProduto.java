package List.FiltrarLista.exercio10.Tests;

import List.FiltrarLista.exercio10.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtoList = new ArrayList<>();

        System.out.print("Digite o numero que voce vai cadastrar: ");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " produto");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            produtoList.add(new Produto(nome, preco, quantidade));
        }

        List<Produto> produtos = produtoList.stream().filter(x -> x.getPreco() <= 100).collect(Collectors.toList());

        System.out.println("Produtos com valor menos que 100 reais: ");

        for (Produto x : produtos) {
            System.out.println(x.getNome());
        }

        sc.close();
    }
}
