package modificadores.lanchonete.atendimento.cozinha;

public class Almoxarife {
    
    private void controlarEntrada() {
        System.out.println("Controlando a entrada dos itens");
    }

    private void controlarSaida() {
        System.out.println("Controlando a saida dos itens");
    }

     void entregarIngredientes() {
        System.out.println("Entregando Igredientes");
        controlarSaida();   
    }

    void trocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas(meuAmigo);
    }
}
