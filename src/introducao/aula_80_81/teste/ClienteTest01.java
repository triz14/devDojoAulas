package introducao.aula_80_81.teste;

import introducao.aula_80_81.dominio.Cliente;
import introducao.aula_80_81.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria", TipoCliente.PESSOA_FISCA);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Maria", TipoCliente.PESSOA_FISCA);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
