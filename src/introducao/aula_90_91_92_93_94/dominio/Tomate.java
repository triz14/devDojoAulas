package introducao.aula_90_91_92_93_94.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.25;
    private String dataValidade;

    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.preco * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
