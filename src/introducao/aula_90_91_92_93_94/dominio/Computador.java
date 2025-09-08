package introducao.aula_90_91_92_93_94.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO = 0.20;

    public Computador(String nome, double preco){
        super(nome,preco);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do pc");
        return this.preco * IMPOSTO;
    }
}
