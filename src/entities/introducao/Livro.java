package entities.introducao;

public class Livro {

    public String titulo;
    public String autor;
    public int numeroPaginas;

    public String toString() {
        return "Título: " + titulo +
                ", Autor: " + autor +
                ", Número de Páginas: " + numeroPaginas;
    }
}
