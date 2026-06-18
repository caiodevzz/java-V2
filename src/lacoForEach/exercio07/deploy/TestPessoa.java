package lacoForEach.exercio07.deploy;

import lacoForEach.exercio07.domin.Pessoa;

public class TestPessoa {
    public static void main(String[] args) {
        Pessoa[] pessoa = {
          new Pessoa("Caio", 18),
          new Pessoa("Lucas", 29),
          new Pessoa("Luiz", 37)
        };

        for (Pessoa pessoa1 : pessoa) {
            System.out.println("Nomes: " + pessoa1.getNome());
        }
    }
}
