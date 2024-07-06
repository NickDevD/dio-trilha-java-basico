package repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        int mesada = 50;
        //enquanto a mesada não chegar a zero o fluxo irá continuar
        //logo, o while é utilizado para estes casos
        while(mesada>0) {
            int valorDoce = valorAleatorio();
            
                if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

            System.out.println("Acabou a mesada!");

        
        }
        
        private static int valorAleatorio() {
            return ThreadLocalRandom.current().nextInt(2, 8);
    }
    
}
