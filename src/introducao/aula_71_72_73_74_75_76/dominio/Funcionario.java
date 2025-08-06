package introducao.aula_71_72_73_74_75_76.dominio;

public class Funcionario extends Pessoa{
    private float salario;

    static {
        System.out.println("Dentro do bloco estatico de funcionario");
    }

    {
        System.out.println("Bloco de inicialização funcionario 1");
    }

    {
        System.out.println("Bloco de inicialização funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construto");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.getSalario());
    }

    public void relatorioPagamento(){
        System.out.println(this.nome);
        System.out.println(this.salario);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
