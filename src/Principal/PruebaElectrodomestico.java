package Principal;

import Clases.Electrodomestico;

public class PruebaElectrodomestico {
    public static void main(String[] args) {

        Electrodomestico electrodomestico = new Electrodomestico("Aire acondicionado", "Siemens", 20);

        System.out.println("Tipo: " + electrodomestico.getTipo());
        System.out.println("Marca: " + electrodomestico.getMarca());
        System.out.println("Potencia: " + electrodomestico.getPotencia());

        System.out.println("Consumo: " + electrodomestico.getConsumo(20));

        System.out.println("Coste de consumo: " + electrodomestico.getCosteConsumo(20, 1.18));

        System.out.println("toString: ");
        System.out.println(electrodomestico.toString());

    }
}
