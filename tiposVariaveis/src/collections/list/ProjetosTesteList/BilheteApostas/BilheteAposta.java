package collections.list.ProjetosTesteList.BilheteApostas;

import java.util.ArrayList;
import java.util.List;

public class BilheteAposta {
    
    private List<BetSlip> listaAposta;

    public BilheteAposta() {
        this.listaAposta = new ArrayList<>();
    }

    public void adicionarAposta(String time, String time2, double cot, double valor) {
            listaAposta.add(new BetSlip(time, time2, cot, valor));
            
    }

    public void removerAposta(String time, String time2, double cot, double valor) {
            listaAposta.remove(new BetSlip(time, time2, cot, valor));
    }
    
    public double calcularValor() {
        double calcularValor = 0d;
        for (BetSlip bet : listaAposta) {
            double retornoAposta = bet.getCot() * bet.getValor();
            calcularValor += retornoAposta;
        }
        return calcularValor;
    }
    
    public void exibirItens() {
        System.out.println(listaAposta);
    }

    public static void main(String[] args) {
        
        BilheteAposta bilheteAposta = new BilheteAposta();

        bilheteAposta.adicionarAposta(" São Paulo", " Palmeiras ",  2.5, 10);

        bilheteAposta.exibirItens();

        System.out.println("Valor do prêmio: " + bilheteAposta.calcularValor());
    }


}
