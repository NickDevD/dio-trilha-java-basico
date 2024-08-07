package Stream_API.Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso)
 * É comumente usada para filtrar os elementos do Stream com base em algum condição.
 */
public class PredicateExample {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javaScript");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e,
        // em seguida, imprimir cada palavra
        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }

}
