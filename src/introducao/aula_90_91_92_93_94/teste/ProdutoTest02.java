package introducao.aula_90_91_92_93_94.teste;

import introducao.aula_90_91_92_93_94.dominio.Computador;
import introducao.aula_90_91_92_93_94.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ruan", 900);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.calcularImposto());

        Produto produto2 = new Computador("Ruan", 90);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getPreco());
        System.out.println(produto2.calcularImposto());
    }
}
