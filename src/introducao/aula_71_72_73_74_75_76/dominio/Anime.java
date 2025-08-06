package introducao.aula_71_72_73_74_75_76.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "nome = " + nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
