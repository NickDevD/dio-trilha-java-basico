package POO.pilares.exemplo;

// classe filha
public class modelos {
    
    public static void main(String[] args) {
        
        automovel jeep = new automovel();

        automovel harley = new automovel();

        //método chamado da classe mãe
        jeep.ligar();

        //setou o chassi do carro utilizando apenas um método
        jeep.setChassi("892145");

        //setou o chassi da moto usando apenas um método
        harley.setChassi("205492");
    }
}
