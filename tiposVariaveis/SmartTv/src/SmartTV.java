public class SmartTV {
   
    //ATRIBUTOS OU CARACTERÍSTICAS DO OBJETO SmartTV
    int canal = 10;
    int volume = 25;
    boolean ligada = false;

    //MÉTODOS DO OBJETO
    //SEMPRE COLOCAR O NOME DO MÉTODO QUE DESEJA DESCREVER
    //EX = VOLUME ---> aumentarVolume
    
    //MUDAR O CANAL
    //NESTE MÉTODO FOI ADICIONADO UM PARAMETRO
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    //Aumentar o canal ou diminuir
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    
    //Método Volume
    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        //REDUZIU O VOLUME EM 1 PONTOS
        volume = volume - 1;
        //volume--;
    }
    
    //Método Ligar
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }
    public void alterarVolume(int novoVolume){
        volume = novoVolume;
    }
    
    
}
