package Operacoes_Basicas_List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //criar uma lista privada
    private List<Livro> livrosCatalog;

    //criar um contrutor para implementar o arraylist
    public CatalogoLivros() {
        this.livrosCatalog = new ArrayList<>();
    }

    //criar os métodos

    public void adicionarLivro(String titulo, String autor, int anoPubli) {
        //método que adiciona um novo livro e seus atributos pré-determinados
        livrosCatalog.add(new Livro(titulo,autor,anoPubli));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livrosCatalog.isEmpty()) {
            for (Livro l : livrosCatalog) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                   livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervalorAno(int anoInicial, int anoFinal) {
        List<Livro> porIntervaloAno = new ArrayList<>();
            if (!livrosCatalog.isEmpty()) {
                for (Livro t : livrosCatalog) {
                    if (t.getAnoPubli() >= anoInicial && t.getAnoPubli() <= anoFinal) {
                        porIntervaloAno.add(t);
                    }
                }
            }
        return porIntervaloAno;
    }

    public Livro persquisarPorTitulo(String titulo) {
            Livro livroPorTitulo = null;
            if (!livrosCatalog.isEmpty()) {
                for (Livro l : livrosCatalog) {
                    if (l.getTitulo().equalsIgnoreCase(titulo)) {
                        livroPorTitulo = l;
                        break;
                    }
                }
            }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2005);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2008);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2008);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2010);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2011);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervalorAno(2000, 2010));
    }
}

