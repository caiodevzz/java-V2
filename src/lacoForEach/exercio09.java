package lacoForEach;

public class exercio09 {
    public static void main(String[] args) {
        int[] valores = {15, 42, 8, 23, 99, 4};
        int maior = valores[0];

        for (int valor : valores) {
            if (valor > maior) {
                maior = valor;
            }
        }
        System.out.println(maior);
    }
}
