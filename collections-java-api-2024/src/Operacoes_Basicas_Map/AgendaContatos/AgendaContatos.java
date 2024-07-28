package Operacoes_Basicas_Map.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    // Atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato1", 123456);
        // o método put em map faz o replace/atualização do valor se a chave for
        // a mesma, ou seja, ele não salva o valor anterior
        agendaContatos.adicionarContato("Contato1", 654321);

        agendaContatos.exibirContato();

    }
}
