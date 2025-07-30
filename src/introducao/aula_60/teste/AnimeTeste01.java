package introducao.aula_60.teste;

import introducao.aula_60.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime("Angelo");
        System.out.println(anime.getEpisodios());
        System.out.println(anime2.getNome());
    }
}
