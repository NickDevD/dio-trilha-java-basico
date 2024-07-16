package POO.pilares.herança;

public class loja {
    
    public static void main(String[] args) {
        
        carro jeep = new carro();
        moto harley = new moto();

        //método set chamado para setar o número de chassi do objeto carro e moto criados na classe loja
        jeep.setChassi("8924537");
        harley.setChassi("45216874");

        //método abstrato chamado de cada classe específica, porém ligados a classe genérica "veículo"
        jeep.ligar();
        harley.ligar();

        //classe genérica veículo pode ser utilizada como coringa, servindo para todos
        veiculo coringa = jeep;
        coringa.ligar();
    }
}
