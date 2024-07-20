package collections.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericExempleMap {

    public static void main(String[] args) {
        
        // Exemplo sem Generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 2", "valor");

            System.out.println(mapaSemGenerics);

        // Exemplo com Generics
        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("Chave 1", 10);
        mapaGenerics.put("Chave 2", 20);

        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
                String chave = entry.getKey();
                int valor = entry.getValue();
                System.out.println("Chave: " + chave + "Valor: " + valor);
        }

    }
    
}
