package Operacoes_Basicas_List.Teste1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Criar um método privado para implementar a lista
    private List<Item> ItensList;

    // Criar um construtor para introduzir o ArrayList
    public CarrinhoDeCompras() {
        this.ItensList = new ArrayList<>();
    }

    //Criar os métodos que serão utilizados

    //Método que adiciona
    public void adicionarItem(String nome, double preco, int quantidade) {
        ItensList.add(new Item(nome,preco,quantidade));
    }

    //Método que remove
    public void removerItem(String nome) {
        List<Item> intensParaRemover = new ArrayList<>();
        if (!ItensList.isEmpty()){
            for (Item i : ItensList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    intensParaRemover.add(i);
                }
            }
            ItensList.removeAll(intensParaRemover);
        }else{
            System.out.println("A lista está vazia!");
        }

    }

    //Método que calcula o valor
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!ItensList.isEmpty()) {
            for (Item item : ItensList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Método criado para exibir o item
    public void exibirItens() {
        if (!ItensList.isEmpty()) {
            System.out.println(this.ItensList);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {

        // Instância criada para carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Macarrão",2, 3);
        carrinhoDeCompras.adicionarItem("Arroz", 3,2);
        carrinhoDeCompras.adicionarItem("Arroz", 2,5);
        carrinhoDeCompras.adicionarItem("Feijão", 9,7);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Arroz");
        carrinhoDeCompras.removerItem("Feijão");

        System.out.println(carrinhoDeCompras.calcularValorTotal());

    }

}
