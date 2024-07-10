package POO.enums;

public class SistemaIbge {
    
    public static void main(String[] args) {
        
        //laço for criado para percorrer os valores e retornar todos eles em sequência
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {

            System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
        }

        //objeto criado, porém neste caso não foi necessário atribuir um new
        //todos os objetos já estavam determinados no ENUM.
        EstadoBrasileiro eb1 = EstadoBrasileiro.SAO_PAULO;

                System.out.println(eb1.getNome());
                System.out.println(eb1.getSigla());
                System.out.println(eb1.getNomeMaiusculo());

        EstadoBrasileiro eb2 = EstadoBrasileiro.RIO_JANEIRO;

                System.out.println(eb2.getNome());
                System.out.println(eb2.getSigla());
                System.out.println(eb2.getNomeMaiusculo());
    }

}
