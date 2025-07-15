package controllers;

import java.util.*;

import models.Book;

public class LibroController {

    public Set<Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparator = (b1, b2) -> {
            
            int comp = b2.getTitulo().compareTo(b1.getTitulo());
            if (comp != 0) return comp;
          
            comp = Integer.compare(b1.getAnio(), b2.getAnio());
            if (comp != 0) return comp;
            
            return 0;
        };

        Set<Book> setOrdenado = new TreeSet<>(comparator);
        setOrdenado.addAll(libros);
        return setOrdenado;
    }

}
