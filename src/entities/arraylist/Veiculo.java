package entities.arraylist;

public class Veiculo {
    private String modelo;
    private double consumo; // km/l
    private double quilometrosPercorridos;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getQuilometrosPercorridos() {
        return quilometrosPercorridos;
    }

    public void setQuilometrosPercorridos(double quilometrosPercorridos) {
        this.quilometrosPercorridos = quilometrosPercorridos;
    }

    public double calcularCustoTotal(double precoCombustivel) {
        double litrosUsados = quilometrosPercorridos / consumo;
        return litrosUsados * precoCombustivel;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Consumo: " + consumo + " km/l, Quilômetros Percorridos: " + quilometrosPercorridos +
                " km, Custo Total de Operação: R$ " + String.format("%.2f", calcularCustoTotal(5.00));
    }
}