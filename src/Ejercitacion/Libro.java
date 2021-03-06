package Ejercitacion;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String isbn, String autor, boolean prestado) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public Libro() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void prestamo(){
        this.setPrestado(true);
    }

    public void devolucion(){
        this.setPrestado(false);
    }

    @Override
    public String toString() { // si  le cambiamos el nombre no puede overridearlo porque no existe
        return "Libro" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor;
    }

}
