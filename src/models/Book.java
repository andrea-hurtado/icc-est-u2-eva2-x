package models;

import java.util.Objects;

public class Book implements Comparable<Book>  {

    String titulo;
    String autor;
    int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;

    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }


     @Override
    public int compareTo(Book other) {
        int cmpTitulo = other.titulo.compareTo(this.titulo);
        if (cmpTitulo != 0) return cmpTitulo;

        int cmpAnio = Integer.compare(this.anio, other.anio);
        return cmpAnio;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return anio == book.anio &&
                Objects.equals(titulo, book.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anio);
    }

     @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", año=" + anio +
                '}';
    }

}
