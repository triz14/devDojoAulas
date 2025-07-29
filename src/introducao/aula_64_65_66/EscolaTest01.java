package introducao.aula_64_65_66;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("William");
        Professor professor2 = new Professor("Suane");
        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("DevDojo", professores);
    }
}
