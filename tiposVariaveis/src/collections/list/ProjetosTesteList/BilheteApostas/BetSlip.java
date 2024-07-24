package collections.list.ProjetosTesteList.BilheteApostas;

public class BetSlip {
    
    private String time;
    private String time2;
    private double cot;
    private double valor;
    
    public BetSlip(String time, String time2, double cot, double valor) {
        this.time = time;
        this.time2 = time2;
        this.cot = cot;
        this.valor = valor;
    }
    

    public String getTime() {
        return time;
    }
    public String getTime2() {
        return time2;
    }
    public double getCot() {
        return cot;
    }
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "BetSlip time = " + time + ", time2=" + time2 + ", cot = " + cot + " valor = " + valor +"";
    }
    
    
}
