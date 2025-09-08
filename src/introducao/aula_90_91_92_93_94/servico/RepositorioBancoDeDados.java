package introducao.aula_90_91_92_93_94.servico;

import introducao.aula_90_91_92_93_94.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
