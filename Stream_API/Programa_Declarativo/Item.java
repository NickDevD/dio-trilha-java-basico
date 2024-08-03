package Stream_API.Programa_Declarativo;

public class Item {

    private double preco;
    private int qtd;

    public Item(double preco, int qtd) {
        this.preco = preco;
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }
    public int getQtd() {
        return qtd;
    }

}
