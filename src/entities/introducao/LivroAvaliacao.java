package entities.introducao;

public class LivroAvaliacao {
    private String titulo;
    private String autor;
    private double preco;
    private int quantidade;

    public LivroAvaliacao(String titulo, String autor, double preco, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String situacao() {
        if (quantidade > 0) {
            return "Disponível";
        } else {
            return "Esgotado";
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                ", Autor: " + autor +
                ", Preço: " + preco +
                ", Quantidade: " + quantidade +
                ", Situação: " + situacao();
    }
}
