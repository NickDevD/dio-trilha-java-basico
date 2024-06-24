package condicionais;
/* controle de fluxo simples
 * Neste controle de fluxo não existe muitas condicionais
*/
public class CaixaEletronico {
    
    public static void main(String[] args){

        double saldo = 25.0;
        double valorSolicitado = 17.0;

            /*
             * Se o ValorSolicitado for menor que o saldo
             * então o fluxo do código seguirá normal
             * caso não seja então não terá retorno.
             */
            if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
            //após a condicional if deve-se informar qual fluxo deve seguir
            //O retorno da condicional

            System.out.println(saldo);

    }
}
