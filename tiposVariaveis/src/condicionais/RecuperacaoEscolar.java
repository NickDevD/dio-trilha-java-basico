package condicionais;
/*
 * Condicional encadeada
 * Utilizada quando se possui mais controles de fluxo para serem validados
 */
public class RecuperacaoEscolar {
    
    public static void main(String[] args){

        int nota = 5;

        if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota <7) 
            System.out.println("Recuperacao");
            
        else
        System.err.println("Reprovado");

    }

}
