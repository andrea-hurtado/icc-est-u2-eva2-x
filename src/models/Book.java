package models;

import java.util.Objects;

public class Book {

    String titulo;
    String autor;
    int anio;

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

}
