package introducao.aula_77_78.teste;

import introducao.aula_77_78.dominio.Carro;
import introducao.aula_77_78.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Gohan");
        System.out.println(carro.COMPRADOR);
    }
}
