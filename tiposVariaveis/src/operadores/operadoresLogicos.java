package operadores;

public class operadoresLogicos {
    public static void main(String[] args) {
        
        boolean condicao1 = false;
        boolean condicao2 = false;

        if(condicao1 && condicao2){

            System.out.println("as duas condicoes sao verdadeiras");
        }
        else{
            System.out.println("uma das condicoes e falsa");
        }
        if(condicao1 || condicao2){
            System.err.println("Uma das condicoes e verdadeira");
        }
        else{
            System.out.println("Ambas sao falsas");
        }
            
            System.out.println("Fim");
    }
}
