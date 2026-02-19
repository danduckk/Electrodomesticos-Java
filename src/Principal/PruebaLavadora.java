package Principal;

import Clases.Lavadora;

public class PruebaLavadora {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora("Balay", 540, 50, true);

        System.out.println(lavadora.toString());

        System.out.println(lavadora.getConsumo(7));

        System.out.println(lavadora.getCosteConsumo(7, 2));


    }
}
