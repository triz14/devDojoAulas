package introducao.aula_64_65_66_67.teste;

import introducao.aula_64_65_66_67.dominio.Time;
import introducao.aula_64_65_66_67.dominio.Jogador;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cadu");
        Time time = new Time("Filme");
        Jogador [] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
