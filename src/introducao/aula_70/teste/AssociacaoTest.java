package introducao.aula_70.teste;

import introducao.aula_70.dominio.Aluno;
import introducao.aula_70.dominio.Local;
import introducao.aula_70.dominio.Professor;
import introducao.aula_70.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("rua Dragon ball");
        Aluno aluno = new Aluno("Jefersson", 29);
        Professor professor = new Professor("William", "java");
        Aluno [] alunos = {aluno};
        Seminario seminario = new Seminario("Terra do nunca", alunos, local);
        Seminario [] seminarios = {seminario};
        professor.setSeminarios(seminarios);
        professor.imprime();
    }
}
