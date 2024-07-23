package collections.genericType.exemplo1;

// Classe genérica
public class BoxGeneric<String> {
    // T representa "Type", variável de (tipo)
    private String t;

    public void set(String t) {
        this.t = t;
    }
    public String get(BoxGeneric box) {
        return t;
    }
    
}
