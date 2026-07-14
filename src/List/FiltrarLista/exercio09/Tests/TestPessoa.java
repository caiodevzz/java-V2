package List.FiltrarLista.exercio09.Tests;

import List.FiltrarLista.exercio09.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoaList = new ArrayList<>();

        System.out.print("Quantas pessoas voce vai digitar ? ");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n ; i++) {
            System.out.println("Digite a " + (i + 1) + " pessoa");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            pessoaList.add(new Pessoa(nome, idade));
        }

        List<Pessoa> pessoas = pessoaList.stream().filter(x -> x.getIdade() >= 18).collect(Collectors.toList());

        System.out.println("Pessoas com mais ou igual a 18 anos: ");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }

        sc.close();
    }
}
