package Stream_API.Programa_Declarativo;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itemList;
    //construtor
    public CarrinhoDeCompras() {
      this.itemList = new ArrayList<>();
    }
    
    //método para calcular valor total dos itens utilizando o Stream API
    public double calcularValorTotal() {

      if (itemList.isEmpty()) {
        throw new RuntimeException("A lista está vazia!");
      }

      // Método Stream simplifica muito o código
      return itemList.stream()
            // pegou todos os itens do carrinho e multiplicou pelo preço
          .mapToDouble(item -> item.getPreco() * item.getQtd())
          // retornou a soma da operação
          .sum();
    }
  }