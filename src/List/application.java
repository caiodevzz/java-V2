package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class application {
    public static void main(String[] args) {
        // Cria uma lista de Strings (nomes)
        List<String> list = new ArrayList<>();

        // Adiciona "Maria" na lista
        list.add("Maria");

        // Adiciona "Alex" na lista
        list.add("Alex");

        // Adiciona "Bob" na lista
        list.add("Bob");

        // Adiciona "Anna" na lista
        list.add("Anna");

        // Adiciona "Marco" na posição de índice 2 (empurra os outros pra frente)
        list.add(2, "Marco");

        // Imprime o tamanho da lista (quantidade de elementos)
        System.out.println(list.size());

        // Percorre cada elemento da lista (loop foreach)
        for (String x : list) {
            // Imprime cada nome da lista
            System.out.println(x);
        }

        // Imprime uma linha separadora
        System.out.println("---------------------");

        // Remove da lista todos os elementos que começam com 'M'
        // x -> x.charAt(0) == 'M' = verifica se a primeira letra é 'M'
        list.removeIf(x -> x.charAt(0) == 'M');

        // Percorre novamente a lista após remoção
        for (String x : list) {
            // Imprime os nomes restantes
            System.out.println(x);
        }

        // Imprime outra linha separadora
        System.out.println("---------------------");

        // Mostra o índice do elemento "Bob"
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        // Mostra o índice do elemento "Marco"
        // (vai dar -1 porque foi removido antes)
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        // Outra linha separadora
        System.out.println("---------------------");

        // Cria uma nova lista contendo apenas nomes que começam com 'A'
        // stream() = transforma a lista em fluxo
        // filter() = filtra os elementos
        // collect() = transforma de volta em lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        // Percorre a lista filtrada
        for (String x : result) {
            // Imprime os nomes que começam com 'A'
            System.out.println(x);
        }

        // Outra linha separadora
        System.out.println("---------------------");

        // Procura o primeiro nome que começa com 'J'
        // findFirst() = pega o primeiro que encontrar
        // orElse(null) = se não achar, retorna null
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

        // Imprime o resultado (vai ser null se não existir)
        System.out.println(name);

    }
}
