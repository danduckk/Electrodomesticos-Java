package Clases;

public class Lavadora extends Electrodomestico {

    private double precio;
    private boolean aguaCaliente = false;

    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        aguaCaliente = false;
    }

    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Precio: " + precio + ", Agua Caliente: " + aguaCaliente;
    }

    public double getConsumo(int horas) {
        if (aguaCaliente == false) {
            return (horas * this.potencia);
        } else {
            return (horas * this.potencia * 0.20);
        }
    }

    // Este metodo no haría falta ponerlo(sobrescribirlo) porque lo hereda directamente, pero activa una comprobación extra del compilador
    @Override
    public double getCosteConsumo(int horas, double costeHora) {
        return super.getCosteConsumo(horas, costeHora);
    }
}
