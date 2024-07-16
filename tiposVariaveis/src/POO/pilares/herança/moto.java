package POO.pilares.herança;

//classe moto criada com o termo "EXTENDS" que significa que tudo que foi criado
//na classe veículo pode ser utilizado pela classe moto
public class moto extends veiculo {
    
    //método abstrato vindo da classe genérica "veículo"
    public void ligar(){
        System.out.println("Moto Ligada");
    }
}
