package escopo;

//classe conta
public class Conta {

    public static void main(String[] args) {
        
    }

    //variável da classe conta
    double saldo = 10.0;
    
    //método da variável saldo + parâmetro
    public void sacar(Double valor) {
        double novoSaldo = saldo - valor;
        System.out.println(novoSaldo);
    }
    //Novo método da variável
    public void imprimirNovoSaldo(Double saldo) {
        //Disponível em toda a classe
        System.out.println(saldo);
        //Disponível apenas no método sacar
        //System.out.println(valor);
    }
    
    
}
