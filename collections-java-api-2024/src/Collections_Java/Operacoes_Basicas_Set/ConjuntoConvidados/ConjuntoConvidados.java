package Operacoes_Basicas_Set.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado removerConvidado = null;
            for (Convidado remove : convidadoSet) {
                if (remove.getCodigoConvite() == codigoConvite) {
                    removerConvidado = remove;
                    break;
                }
            }
            convidadoSet.remove(removerConvidado);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Conv 2", 12);
        conjuntoConvidados.adicionarConvidado("Conv 2", 13);
        conjuntoConvidados.adicionarConvidado("Conv 3", 12);

        conjuntoConvidados.exibirConvidados();

    }
}
