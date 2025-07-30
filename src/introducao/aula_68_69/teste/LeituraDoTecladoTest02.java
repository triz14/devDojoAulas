package introducao.aula_68_69.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e responderei sim ou não");
        String pergunta = leia.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
    }
}
