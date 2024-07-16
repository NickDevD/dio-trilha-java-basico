package POO.pilares.herança;

//classe carro criado com o termo "EXTENDS" que significa que tudo que foi criado
//na classe veículo pode ser utilizado pela classe carro
public class carro extends veiculo {
    
    //método ligar vindo da abtração criada na classe genérica 
    public void ligar(){
        conferirCombustivel();
        conferirCambio();
        System.out.println("Carro ligado");
    }
    
    private void conferirCombustivel() {
        System.out.println("Combustível OK!");
    }
    private void conferirCambio() {
        System.out.println("Câmbio OK!");
    }

    
}
