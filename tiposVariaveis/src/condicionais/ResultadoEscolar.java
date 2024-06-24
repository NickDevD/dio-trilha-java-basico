package condicionais;
/*
 * Condicao ternaria possibilita o refatormanto
 * da condicao para simplificar e deixar o codigo
 * limpo sem tantas linhas desnecessarias
 */
public class ResultadoEscolar {
    
    public static void main(String[] args) {
        
        int nota = 3;
        //exemplo de condicao ternaria com o refatoramento
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        
        //outro emxemplo utilizando outra variável
        String recuperacao = nota >= 5 && nota < 7 ? "Recuperao" : "Reprovado";

        //exemplo de refatoramento encadeado
        String resultadoFinal = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao Final" : "Reprovado";
        
        System.out.println(resultadoFinal);
    }
}
