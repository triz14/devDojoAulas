package introducao.aula_58_59.teste;

import introducao.aula_58_59.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball", "Ação", 120, "Fantasia");
        Anime anime2 = new Anime("Dragon Ball", "Ação", 120, "Fantasia", "Mappa");
        anime.imprime();
        anime2.imprime();
    }
}
