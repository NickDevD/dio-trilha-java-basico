package repeticao;

import java.util.Random;

public class ExemploDoWhile {
    
    public static void main(String[] args) {
            System.out.println("Discando...");

            do {

                System.out.println("Telefone tocando");


            }while(tocando());

            System.out.println("Alo !!!");
    
        }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        return ! atendeu;
    }
}
