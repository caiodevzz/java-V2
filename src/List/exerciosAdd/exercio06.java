package List.exerciosAdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomesPessoas = new ArrayList<>();

        System.out.print("Quantos nomes voce vai adionar ? ");

        int numeroDeNomes = sc.nextInt();

        for (int i = 0; i < numeroDeNomes ; i++) {
            System.out.println("Digite o " + (i + 1) + " nome");

            String nome = sc.next();
            nomesPessoas.add(nome);
        }

        System.out.print("Voce quer adicinar mais pessoas ? ");

        String opcao = sc.next();

        if (opcao.equals("Sim")) {

                System.out.println("Adione qualquer pessoa em qualquer posicao");

                System.out.print("Posicao: ");
                int psoicao = sc.nextInt();
                sc.nextLine();
                System.out.print("Nome: ");
                String nome2 = sc.nextLine();

                nomesPessoas.add(psoicao, nome2);

            System.out.println("Lista de nomes: ");

            for (String x : nomesPessoas) {
                System.out.println(x);
            }

        }else if (opcao.equals("Nao")) {
            System.out.println("Ok AQUI ESTA SUA LISTA SEM ELEMENTOS: ");

            for (String x : nomesPessoas) {
                System.out.println(x);
            }
        }


        sc.close();
    }
}
