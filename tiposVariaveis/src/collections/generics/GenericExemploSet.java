package collections.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericExemploSet {

    public static void main(String[] args) {
        
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

        System.out.println(conjuntoSemGenerics);

        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2"); //Permite adicionar apenas Strings

        for (String elemento : conjuntoGenerics ) {
                System.out.println(elemento);
        }
    }
    
}
