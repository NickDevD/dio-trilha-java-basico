package Collections_Java.Operacoes_Basicas_Map.Ordenacao;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Eventos eventos = new Eventos(nome, atracao);
        eventosMap.put(data, eventos);
    }

    public void exibirAgenda() {
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data " + entry.getKey() );
            break;
            }
        }
    }
}
