package operadores;

public class operadorRelacional {
    
    public static void main(String[] args) {
        
        //equals é o termo recomendado para comparação de nome e objetos
        String nomeUm = "Nick";
        String nomeDois = new String("Nick");

        System.out.println(nomeUm.equals(nomeDois));
        
        
       //relacionais 
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        //condicional utilizando relacional
        if(numero1 != numero2) {
            System.out.println("verdade");
        }

        System.out.println("numeroUm e Igual a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        
        System.out.println(simNao);

        simNao = numero1 != numero2;
        
        System.out.println(simNao);

        simNao = numero1 <= numero2;

        System.out.println(simNao);
    }
}
