package tiposVariaveis.SistemaPremiacao;

import java.util.Scanner;

public class Sorteio {
    
    public static void main(String[] args) {
        
        Scanner sorteio = new Scanner(System.in);

        
        int numero = sorteio.nextInt();
        System.out.println("Digite seu numero da sorte: ");
        
        if(numero == 10)
        System.out.println("Parabens, voce ganhou!!!");

        else
        System.err.println("Que pena, não foi desta vez!");
       
        
    }
}
