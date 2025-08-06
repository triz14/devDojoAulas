package introducao.aula_71_72_73_74_75_76.teste;
import introducao.aula_71_72_73_74_75_76.dominio.Endereco;
import introducao.aula_71_72_73_74_75_76.dominio.Funcionario;
import introducao.aula_71_72_73_74_75_76.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Berrini");
        endereco.setCep("05674123");
        Pessoa pessoa = new Pessoa("Fábio");
        pessoa.setCpf("12345678");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Ana");
        funcionario.setCpf("12345678");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(12345);
        funcionario.imprime();
    }
}

