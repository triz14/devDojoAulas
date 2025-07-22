package introducao.aula_61;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Audi", 300);
        Carro carro2 = new Carro("Mercedez", 310);
        Carro carro3 = new Carro("Ferrari", 320);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
