package POO.pilares.herança;

//O termo "abstract" representa uma abstração, que significa um método comun entre todas as classes
//porém, cada um vai possuir uma particularidade
public abstract class veiculo {

    //método get and set criado para definir e star as características dos veículos
    //que a classe loja possui
    public String chassi;

    private String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    public abstract void ligar();

    
}
