import java.util.Scanner;

public class CalculoSalario {
    
    public static void main(String[] args) {
        
        Scanner scanSalario = new Scanner(System.in);

        float salarioLiquido = 0;
        
        
        
        System.out.println("Olá, digite o seu nome para iniciar a verificação: ");
            String nome = scanSalario.next();
        System.out.println("Bom dia " + nome + ", insira o valor do seu salário para iniciar o calculo:");
            float salario = scanSalario.nextFloat();

                        if(salario >= 0 && salario <= 1100) {
                            salarioLiquido = salario - (salario * 0.05F);
                            System.out.println("Seu salário é: " + salarioLiquido);

                        } else if (salario >= 1100.01 && salario <= 2500.00) {
                            salarioLiquido = salario - (salario * 0.10F);
                            System.out.println("Seu salário é: " + salarioLiquido);

                        } else {
                            salarioLiquido = salario - (salario * 0.15F);
                            System.out.println("Seu salário é: " + salarioLiquido);
                        }

                        scanSalario.close();
    }
    
}
