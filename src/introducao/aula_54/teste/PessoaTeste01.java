package introducao.aula_54.teste;

import introducao.aula_54.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Goku");
        pessoa.setIdade(23);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
