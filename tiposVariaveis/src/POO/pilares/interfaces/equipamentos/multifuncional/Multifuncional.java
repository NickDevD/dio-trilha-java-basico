package POO.pilares.interfaces.equipamentos.multifuncional;

import POO.pilares.interfaces.equipamentos.copiadora.copiadora;
import POO.pilares.interfaces.equipamentos.digitalizadora.digitalizadora;
import POO.pilares.interfaces.equipamentos.impressora.impressora;

public class Multifuncional implements copiadora, impressora, digitalizadora{

    public void copiar() {
        System.out.println("Copiando de uma Multifuncional");
    }
    public void digitalizar() {
        System.out.println("Digitalizando de uma Multifuncional");
    }
    public void imprimir() {
        System.out.println("Imprimindo de uma Multifuncional");
    }
    
     
}
