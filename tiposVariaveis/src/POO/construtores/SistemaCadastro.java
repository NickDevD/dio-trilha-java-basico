package POO.construtores;

public class SistemaCadastro {

    public static void main(String[] args) {
        
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Marcos", "10551001488");
        Pessoa joao = new Pessoa();

        //definimos o endereço de marcos
        marcos.setEndereco("Rua das Marias");
        
        //mas não temos as definições de nome e CPF pois os "sets" não foram atribuídos

    }
    
}
