package modificadores.lanchonete.atendimento.cozinha;

import modificadores.lanchonete.Atendente;

public class Cozinheiro {
    
    //ações realizadas pelo cozinheiro
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando Suco");
    }

    //este método chama outros dois métodos para si
    public void adicionarComboNobalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("Preparando lanche");
    }

    private void prepararVitamina() {
        System.out.println("Preparando vitamina");
    }

    private void prepararComboLanche() {
        prepararLanche();
        prepararVitamina();
    }

    //este método chamou o método criado na classe atendente
    //atribuiu o paramêtro "meuAmigo" para identificar a classe
    //public void pedirParaTrocarGas(Atendente meuAmigo) {
        //meuAmigo.trocarGas();
    //}

    public void pedirInredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
