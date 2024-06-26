package metodos;

public class MetodoSemRetorno {
    
    //Bloco do método (main)
    public static void main(String[] args) {

        //sempre se faz necessário chamar o metodo main
        dizerOla();

        //chamada do metodo + o parametro (string nome) já definido como "Nicholas"
        //com o metodo criado é possível chama-lo quantas vezes desejar atrivuindo apenas suas variáveis
        dizerOi("Nicholas");
        dizerOi("Carla");
        dizerOi("João");

        //variável determinada para o método com retorno (return)
        String mensagemDespedida = dizerAdeus();
        //é possível manipular a variável quando se tem um metodo com retorno
        System.out.println(mensagemDespedida.toUpperCase());
        //sem manipulação
        System.out.println(mensagemDespedida);

        int minhaIdade = idade();

    }

    //metodo com retorno void sem parâmetro
    static void dizerOla(){
        System.out.println("Olá ");
    }
    //metodo com retorno void + parametro tipo (String nome)
    static void dizerOi(String nome){
        System.out.println("Oi " + nome + " Tudo bem?");

    }
    //metodo com retotno
    static String dizerAdeus(){
       return "Adeus";
    }

    static int idade(){
        return 30;
    }

    
}


