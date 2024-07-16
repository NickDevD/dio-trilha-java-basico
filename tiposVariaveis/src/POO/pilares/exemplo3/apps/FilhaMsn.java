package POO.pilares.exemplo3.apps;

public class FilhaMsn extends ServicoPai {

    public void enviarMensagem() {
        verificarConexão();
        System.out.println("Enviando mensagem via Messenger");

    }
    public void receberMensagem() {

        System.out.println("Recebendo mensagem via Messenger");
    }
}
