package entities.introducao;

public class Veiculo {

    public String modelo;
    public String marca;
    public int anoFabricacao;

    public String toString() {
        return "Modelo: " + modelo +
                ", Marca: " + marca +
                ", Ano de Fabricação: " + anoFabricacao;
    }
}