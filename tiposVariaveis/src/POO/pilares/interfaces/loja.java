package POO.pilares.interfaces;

import POO.pilares.interfaces.equipamentos.copiadora.copiadora;
import POO.pilares.interfaces.equipamentos.digitalizadora.digitalizadora;
import POO.pilares.interfaces.equipamentos.impressora.deskJet;
import POO.pilares.interfaces.equipamentos.impressora.impressora;
import POO.pilares.interfaces.equipamentos.multifuncional.Multifuncional;

public class loja {
    
    public static void main(String[] args) {
        
        Multifuncional MF = new Multifuncional();
        impressora impressora = MF;
        digitalizadora digitalizadora = MF;
        copiadora copiadora = MF;

        impressora.imprimir();
    }
}
