package collections.list.ArrayList;

import java.util.ArrayList;

public class Frutas {

    public static void main(String[] args) {
        
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maça");
        frutas.add("uva");

        frutas.remove("");

        for (String f : frutas) {
            System.out.println(f);
        }
 
    }
    
}
