package POO.getterStter.escola;

public class Aluno {

    private String nome;
    private int idade;
    
    //atributo adicionado após os outros
    private int matricula;

    //getter and setter criado pela IDE, na opção source
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /*
     inicialmente pegamos o nome com o "get" utilizando o tipo correspondente
     e logo após setamos o nome com o "set" atribuindo um paramêtro do mesmo tipo
    */
    public String getNome() {
        return nome;
    }
    public void setNome(String newNome) {
        nome = newNome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

}
