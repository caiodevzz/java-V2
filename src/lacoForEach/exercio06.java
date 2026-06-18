package lacoForEach;

public class exercio06 {
    public static void main(String[] args) {

        int[] numers = {7, 3, 7, 9, 7, 1, 4};
        int contador = 0;

        for (int num : numers) {
            if (num == 7) {
                contador++;
            }
        }

        System.out.println(contador);
    }
}
