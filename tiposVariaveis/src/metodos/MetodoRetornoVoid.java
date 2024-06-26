package metodos;

public class MetodoRetornoVoid {
    
    public static void main(String[] args) {
        
        //como o parametro foi determinado é necessário atribuir os valores
        // de num1 e num2
        somarNum(1,2);
        
        //é possível criar mais chamadas e desta forma economizar linhas de código
        somarNum(10, 20);
        somarNum(15, 60);
        somarNum(100, 120);

        multiplicar(2, 3, 4);

        dividir(5, 2);
    }

                static void somarNum(int num1, int num2){
                    System.out.println("Soma dos numeros: " + (num1 + num2));
                }

                static void multiplicar(int a, int b, int c) {
                    System.out.println("Resultado: " + (a * b * c));
                }

                static void dividir(float n1, float n2) {
                    System.out.println("Resultado da divisão: " + (n1/n2));
                }


}
