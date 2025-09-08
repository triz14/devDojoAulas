package introducao.aula_90_91_92_93_94.teste;

import introducao.aula_90_91_92_93_94.dominio.Computador;
import introducao.aula_90_91_92_93_94.dominio.Televisao;
import introducao.aula_90_91_92_93_94.dominio.Tomate;
import introducao.aula_90_91_92_93_94.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("sla", 1200);
        Tomate tomate = new Tomate("italiano", 12);
        Televisao televisao = new Televisao("sla", 2344);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(televisao);
    }
}
