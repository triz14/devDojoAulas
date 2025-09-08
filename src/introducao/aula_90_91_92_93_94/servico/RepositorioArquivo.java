package introducao.aula_90_91_92_93_94.servico;

import introducao.aula_90_91_92_93_94.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
