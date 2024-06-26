package excecoes;

public class FormatadorCep {
    
    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep("2376506");

        } catch (CepInvalidException e) {
            e.printStackTrace();
            System.out.println("CEP Inválido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidException {
        if(cep.length() != 8)
            throw new CepInvalidException();

            return "23.765-064";
    }
}
