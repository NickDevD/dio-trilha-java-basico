package Collections_Java.Operacoes_Basicas_Set.Ordencao;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;

public class Produto implements Comparable<Produto> {

    // Atributos
    private String nome;
    private int cod;
    private double preco;
    private int quantidade;

    // Objeto da classe produto
    public Produto (String nome, int cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto {" + nome + "," + cod + "," + "R$" + preco + "," + quantidade + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return true;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }


    // Implementou o método "Comparable"
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}
// classe criada para possibilitar a implementação do método de comparação
// "Comparator". com retorno da comparação dos preços

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
