package exerciosP2;

import java.util.Scanner;

public class exercio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qauntos alunos serao digitados ? ");
        int alunos = sc.nextInt();
        String[] nome = new String[alunos];
        double[] notaSemestre1 = new double[alunos];
        double[] notaSemestre2 = new double[alunos];
        double media;

        for (int i = 0; i < alunos ; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            nome[i] = sc.nextLine();
            notaSemestre1[i] = sc.nextDouble();
            notaSemestre2[i] = sc.nextDouble();
        }


        System.out.println("Alunos aprovadois: ");
        for (int i = 0; i < alunos ; i++) {
            media = (notaSemestre1[i] + notaSemestre2[i]) / 2;

            if (media >= 6.0) {
                System.out.printf("%s\n", nome[i]);
            }

        }

        sc.close();
    }
}
