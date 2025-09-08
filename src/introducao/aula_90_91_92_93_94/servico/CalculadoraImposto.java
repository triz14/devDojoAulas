package introducao.aula_90_91_92_93_94.servico;

import introducao.aula_90_91_92_93_94.dominio.Produto;
import introducao.aula_90_91_92_93_94.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getPreco());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof  Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }

}
