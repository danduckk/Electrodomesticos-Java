package Clases;

public class Electrodomestico {
    protected String tipo;
    protected String marca;
    protected double potencia;

    // CONSTRUCTOR
    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    // SETTERS Y GETTERS
    public String getTipo() {
        return tipo;
    }
    public String getMarca() {
        return marca;
    }
    public double getPotencia() {
        return potencia;
    }
    public double getConsumo(int horas) {
        return horas * potencia;
    }
    public double getCosteConsumo(int horas, double costeHora) {
        return horas * costeHora;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Marca: " + marca + ", Potencia: " + potencia;
    }
}
