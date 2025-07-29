package introducao.aula_64_65_66.teste;

import introducao.aula_64_65_66.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Maria");
        Jogador jogador2 = new Jogador("Marcos");
        Jogador jogador3 = new Jogador("Fernanda");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
