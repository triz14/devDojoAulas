package introducao.aula_60.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    {
        System.out.println("Ihuuuuuuuuuuu");
        episodios = new int[100];
        for(int i =0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio : this.episodios){
            System.out.println(episodio + "");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
