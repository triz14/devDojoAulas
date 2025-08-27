package introducao.aula_84_85_86.teste;

import introducao.aula_84_85_86.dominio.Desenvolvedor;
import introducao.aula_84_85_86.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 1200);
        System.out.println(gerente);
        Desenvolvedor dev = new Desenvolvedor("Jonas", 20000);
        System.out.println(dev);
        dev.imprime();
        gerente.imprime();
    }

}
