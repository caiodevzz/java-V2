package List.Encontrar_A_Primeria_Ocorrencia.exercio07.deployment;

import List.Encontrar_A_Primeria_Ocorrencia.exercio07.entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        List<Produto> produtoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos voce vai digitalizar ? ");
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

        Produto produto = produtoList.stream().filter(x -> x.getPreco() > 100).findFirst().orElse(new Produto("nenhum produto encontrado", 0.0, 0));

        System.out.print("Produto: ");
        System.out.println(produto);

        sc.close();
    }
}
