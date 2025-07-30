package introducao.aula_70.dominio;

public class Seminario {
    private String nome;
    private Aluno [] alunos;
    private Local local;

    public Seminario(String nome) {
        this.nome = nome;
    }

    public Seminario(Aluno[] alunos, String nome) {
        this.alunos = alunos;
        this.nome = nome;
    }

    public Seminario(String nome, Aluno[] alunos, Local local) {
        this.nome = nome;
        this.alunos = alunos;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
