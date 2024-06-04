package operadores;

public class operadorTernario {
    
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;
        
        //operador ternário
        String resultado = a==b ?"verdadeiro" : "falso";

    //if/else padrão
    
        //if(a==b)
            //resultado = "verdadeiro";
        //else
        //resultado = "falso";

        System.err.println(resultado);
    }
}
