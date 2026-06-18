package lacoForEach;

public class exercio04 {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println("PAR: " + num);
            } else if (num % 1 == 0) {
                System.out.println("IMPAR: " + num);
            }
        }

    }
}
