package introducao.aula_57.teste;

import introducao.aula_57.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball", "Ação", 120);
        anime.init("Dragon Ball", "Ação", 120, "Fantasia");
        anime.imprime();
    }
}
