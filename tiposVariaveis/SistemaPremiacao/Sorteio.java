package tiposVariaveis.SistemaPremiacao;


public class Sorteio {
    
    public static void main(String[] args) {
        
        
        int numero = 10;
        

        switch (numero) {
            case 10 : {
                System.out.println("Parabens, seu numero foi sorteado");
                //break;
            }
            case 20 : {
                System.out.println("Uau, o premio dobrou!");
                System.out.println("Ganhe muito mais com o bonus");
                break;
            }
            default: {
                System.err.println("Nao foi desta vez!");
                System.out.println("Boa sorte na proxima");
                break;
            }
                
        }
        
       
       
        
    }
}
