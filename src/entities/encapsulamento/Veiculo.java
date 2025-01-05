package entities.encapsulamento;

import java.time.Year;

public class Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int calcularIdade() {
        int anoAtual = Year.now().getValue(); // Obtém o ano atual
        return anoAtual - anoFabricacao;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Marca: " + marca + ", Ano de Fabricação: " + anoFabricacao +
                ", Idade: " + calcularIdade() + " anos";
    }
}