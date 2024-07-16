package POO.pilares.exemplo2;

public class servicoDeMensagens {
    
    public void enviarMensagem() {
        verificarConexão();
        System.out.println("Enviando mensagem");
        validarMensagem();
        System.out.println("Mensagem enviada!");

    }
    public void receberMensagem() {
        verificarConexão();
        validarMensagem();
        System.out.println("Mensagem recebida!");
        salvarMensagem();

    }

    private void verificarConexão() {
        System.err.println("Conexão estabelecida: OK");

    }
    private void validarMensagem() {
        System.err.println("Mensagem verificada: OK");

    }
    private void salvarMensagem() {
        System.err.println("Mensagem salva: OK");

    }
}
