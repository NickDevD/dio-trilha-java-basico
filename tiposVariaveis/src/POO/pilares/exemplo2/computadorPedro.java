package POO.pilares.exemplo2;

public class computadorPedro {
    
    public static void main(String[] args) {
        
        msnMessenger msn = new msnMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        facebookMessenger faceM = new facebookMessenger();
        faceM.enviarMensagem();
        faceM.receberMensagem();


        telegramMessenger teleM = new telegramMessenger();
        teleM.enviarMensagem();
        teleM.receberMensagem();
        

    }
}
