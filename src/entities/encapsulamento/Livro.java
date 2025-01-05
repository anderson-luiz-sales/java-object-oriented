package entities.encapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Número de Páginas: " + numeroPaginas;
    }
}