package introducao.aula_68_69.teste;

import java.util.Scanner;

public class LeituraDotecladoTest01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = leia.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();

        System.out.println(nome);
        System.out.println(idade);

    }
}
