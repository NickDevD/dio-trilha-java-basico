package POO.pilares.exemplo3;

import POO.pilares.exemplo3.apps.FilhaFace;
import POO.pilares.exemplo3.apps.FilhaMsn;
import POO.pilares.exemplo3.apps.FilhaTele;
import POO.pilares.exemplo3.apps.ServicoPai;

public class Namorado {

    public static void main(String[] args) {
        
        ServicoPai smi = null;

        String filhaEscolhida = "Msn";

        if(filhaEscolhida.equals("Tele")){
            smi = new FilhaTele();

        }else if(filhaEscolhida.equals("Msn")){
            smi = new FilhaMsn();
        }if(filhaEscolhida.equals("Face")) {
            smi = new FilhaFace();
        }

        //método que sempre estará presente, pois se trata de uma regra abstrata
        smi.enviarMensagem();
        smi.receberMensagem();
    }
    
}
