package POO.construtores;

public class Pessoa {

    private String nome;
    private String CPF;
    private String endereco;

    //método construtor
    // o nome deverá ser igual ao nome da classe
    public Pessoa (String nome, String CPF) {
        this.CPF = CPF;
        this.nome = nome;
    }
    //método construtor sem parâmetro definido
    public Pessoa () {
        super();
    }

    //getters e setters

    public String getNome() {
        return nome;
    }
   
    public String getCPF() {
        return CPF;
    }
   
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
