package lacoForEach;

public class exercio08 {
    public static void main(String[] args) {

        int[] notas = {8, 7, 9 ,6, 10};
        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        double media = (double) soma / notas.length;

        System.out.printf("Media: %.1f %n", media);
    }
}
