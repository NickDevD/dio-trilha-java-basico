package terminal;
//importando classe scanner
import java.util.Scanner;

public class escanear {
 
    public static void main(String[] args) {
        
        //criando objeto scanner 
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura: ");
        double altura = scanner.nextDouble();

        
    }
}
