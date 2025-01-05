package entities.encapsulamento;

public class Filme {
    private String titulo;
    private int anoLancamento;
    private int duracao;

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                ", Ano de Lançamento: " + anoLancamento +
                ", Duração: " + duracao + " minutos";
    }
}