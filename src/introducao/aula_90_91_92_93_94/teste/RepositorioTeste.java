package introducao.aula_90_91_92_93_94.teste;

import introducao.aula_90_91_92_93_94.repositorio.Repositorio;
import introducao.aula_90_91_92_93_94.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio =  new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegetta");
        System.out.println(list);
    }
}
