package POO.pilares.exemplo3.apps;

//classe abstrata, ou seja, não define nada para as outras classes, apenas podendo
//exigir que condições estejam presentes, porém sem parâmetros
public abstract class ServicoPai {

    //métodos abstratos sem corpo
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    
    //o modificador de acesso "protected" permite que as classes filhas possuam acesso ao método 
    protected void verificarConexão() {
        System.out.println("Conexão estabelecida: OK");
    }

}
