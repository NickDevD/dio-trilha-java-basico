package Collections_Java.Operacoes_Basicas_List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaOrdenacao;

    public OrdenacaoPessoas(){
        this.listaOrdenacao = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaOrdenacao.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaOrdenacao);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaOrdenacao);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("nome 1", 25,1.72);
        ordenacaoPessoas.adicionarPessoa("nome 2", 17,1.83);
        ordenacaoPessoas.adicionarPessoa("nome 3", 16,1.56);
        ordenacaoPessoas.adicionarPessoa("nome 4", 25,1.56);

        System.out.println(ordenacaoPessoas.listaOrdenacao);
        System.out.println("");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}
