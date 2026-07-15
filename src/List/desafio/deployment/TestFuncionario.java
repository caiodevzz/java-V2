package List.desafio.deployment;

import List.desafio.entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        List<Funcionarios> funcionariosList = new ArrayList<>();

        System.out.print("Quantos funcionarios voce vai digitar ? ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite o " + (i + 1) + " funcionario");

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            funcionariosList.add(new Funcionarios(id, nome, salario));
        }

        System.out.print("Digite o id do funcionario que voce quer aumentar o salario ");
        int id1 = sc.nextInt();

        boolean talvez = false;
        for (Funcionarios x : funcionariosList) {
            if (x.getId() == id1) {
                System.out.print("Entre com o valor do aumento: ");
                double aumento = sc.nextDouble();
                x.AumentoDeSalario(aumento);
                talvez = true;
                break;
                }
        }

        if (talvez == false) {
            System.out.println("Funcionario nao encontrado");
        }

        System.out.println("Funcionarios: ");
            for (Funcionarios c : funcionariosList) {
                System.out.println(c);
            }
        sc.close();
        }
    }
