package Collections_Java.Operacoes_Basicas_List.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    // atributo
    private List<Tarefa> tarefaList;

    // Sempre que um atributo tipo list for criado
    // será possível criar um construtor sem parâmetro
    // porém com uma ArrayList como retorno
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    // Método criado para adicionar tarefas na lista de tarefas
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Método criado para remover tarefas da lista de tarefas
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Método criado para obter o total de tarefas adicionadas na lista
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // Método criado para imprimir as tarefas adicionadas
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    // Método "main" criado para realizar os testes com os métodos criado acima
    public static void main(String[] args) {

        //Objeto criado partindo da classe tarefa
        ListaTarefas listaTarefas = new ListaTarefas();

        // Objeto adicioando as tarefas
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Praticar");
        listaTarefas.adicionarTarefa("Descansar");
        listaTarefas.adicionarTarefa("Estudar");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        // Objeto removendo as tarefas
        listaTarefas.removerTarefa("");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        // Objeto imprimindo as descrições das tarefas
        listaTarefas.obterDescricoesTarefas();
    }
}
