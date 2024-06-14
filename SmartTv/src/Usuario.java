public class Usuario {
    
    public static void main(String[] SmartTV){

        //OBJETO SmartTV1 FOI CRIADO
        SmartTV smartTV1 = new SmartTV();

        //MÉTODOS - IMPRESSOS DAS CARACTERÍSTICAS DEFINIDAS NA CLASSE SmartTV
        System.out.println("TV ligada ? " + smartTV1.ligada);
        System.out.println("Canal Atual: " + smartTV1.canal);
        System.out.println("Volume Atual: " + smartTV1.volume);

        //REFERENCIANDO O MÉTODO AO SEUS ATRIBUTOS
        smartTV1.desligar();
        System.out.println("TV ligada? Estado Atual " + smartTV1.ligada);
        
        smartTV1.ligar();
        System.out.println("TV ligada? Estado Atual " + smartTV1.ligada);

        //ALTERANDO O VOLUME
        smartTV1.aumentarVolume();
        smartTV1.aumentarVolume();
        smartTV1.aumentarVolume();
        smartTV1.diminuirVolume();
        System.out.println("Volume Atual: " + smartTV1.volume);

        smartTV1.mudarCanal(2);
        System.out.println("Canal Atual: " + smartTV1.canal);

        smartTV1.mudarCanal(15);
        System.out.println("Novo Canal: " + smartTV1.canal);

        smartTV1.alterarVolume(12);
        System.out.println("Volume Atual: " + smartTV1.volume);
        
    }
}
