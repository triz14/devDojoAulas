package introducao.aula_64_65_66;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bia");
        Time time = new Time("The Flash");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
