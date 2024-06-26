package excecoes;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    
    
    public static void main(String[] args) {
     
        //dentro do bloco (try) é necessário que fique todo o bloco de codigo
    try {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
                    String nome = scan.nextLine();

            System.out.println("Digite seu sobrenome: ");
                    String sobrenome = scan.nextLine();

            System.out.println("Digite sua idade> ");
                    int idade = scan.nextInt();
        
            System.out.println("Digite sua altura: ");
                    double altura = scan.nextDouble();


                    //se não ocorrer exceções de erro será impressa a mensagem abaixo
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho a idade de: " + idade);
            System.out.println("Possuo uma altura de: " + altura);
            scan.close();
    }
    //no bloco (catch) é necessário inserir os possíveis erros e atribuir um retorno
    catch (InputMismatchException e) {
        System.err.println("Os campos idade e altura precisam ser numericos");
    }
        
    }
}
