package collections.list.ArrayList;

import java.util.ArrayList;

public class Livros {
    
    public static void main(String[] args) {
        
        // Objeto lista vazia criado
        // lista sem parâmetro ou atributo
        ArrayList<String> livroList = new ArrayList<>();

        livroList.add("Livro 1");
        livroList.add("Livro 2");
        livroList.add("Livro 3");

       System.out.println(livroList);

       System.out.println(livroList.size());

    }
}
