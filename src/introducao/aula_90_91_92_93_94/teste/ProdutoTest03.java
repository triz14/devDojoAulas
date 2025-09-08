package introducao.aula_90_91_92_93_94.teste;

import introducao.aula_90_91_92_93_94.dominio.Computador;
import introducao.aula_90_91_92_93_94.dominio.Produto;
import introducao.aula_90_91_92_93_94.dominio.Tomate;
import introducao.aula_90_91_92_93_94.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ruan", 900);


        Tomate tomate = new Tomate("Ruan", 90);
        tomate.setDataValidade("12/12/12");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
