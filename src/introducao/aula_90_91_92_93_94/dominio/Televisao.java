package introducao.aula_90_91_92_93_94.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.23;
    public Televisao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto televisao");
        return this.preco * IMPOSTO_POR_CENTO;
    }
}

