package modificadores.lanchonete;

import modificadores.lanchonete.atendimento.cozinha.Almoxarife;
import modificadores.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    
    public static void main(String[] args) {
        
        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estar disponíveis para toda a aplicação
            //almoxarife.controlarEntrada();
            //almoxarife.controlarSaida();
        //ações que somente o pacote cozinha precisa conhecer
            //almoxarife.entregarIngredientes();

        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda a aplicação
            //cozinheiro.prepararLanche();
            //cozinheiro.prepararVitamina();
            //cozinheiro.prepararComboLanche();
            //cozinheiro.pedirParaTrocarGas(null);

        //ações que o estabelecimento precisa ter ciência
            cozinheiro.adicionarLancheNoBalcao();
            cozinheiro.adicionarSucoNoBalcao();
            cozinheiro.adicionarComboNobalcao();
        
        Atendente atendente = new Atendente();

        //ação que não precisa estar disponível para toda a aplicação
            //atendente.pegarLancheCozinha();
            atendente.servindomesa();
        //ação que somente o pacote cozinheiro precisa saber
            //atendente.trocarGas();
    }
}
