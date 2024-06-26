package metodos.AtributosMetodos;

public class Teste {

    //variável criada fora do metodo main e da classe static
    String nome = "Nick";
    
    //Variável com a classe static
    static int idade = 30;

    public static void main(String[] args) {

        //Objeto (Teste) criado para permitir o acesso dos metodos fora da 
        //classe static
        Teste teste = new Teste();
        
        System.out.println(teste.nome);

        System.out.println(idade);
        
        teste.ola();

    }
    //metodo criado fora, sem a classe (static)
    void ola() {
        System.out.println("Olá " + nome);
    }
    
}
