package POO.pilares.exemplo;

//classe mãe de onde serão herdadas todas as outras classes
public class automovel {
    
    //utilizando o java beans com o método get and set é possível setar valores para cada objeto criado, sem a necessidade 
    //de criar novos métodos para cada novo objeto
    private String chassi;
        public String getChassi(){
            return chassi;
        }
        public void setChassi(String chassi) {
            this.chassi = chassi;
        }
        
    //métodos publicos que podem ser visualizados pela classe filha
    public void ligar() {

        //método privado que pode ser chamado pela classe filha, mas não pode ser visualizado
        conferirCambio();
        conferirCombustivel();
         System.out.println("Carro ligado");

    }
    //métodos encapsulados privados que são vistos apenas por quem está dentro desta classe
    private void conferirCombustivel() {
        System.out.println("Combustível ok");

    }
    private void conferirCambio() {
        System.out.println("Câmbio ok");
        
    }
}
