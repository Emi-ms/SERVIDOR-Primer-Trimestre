
//Escribe un programa que calcule el precio final de un producto según su
// base imponible (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido)
// y el código promocional. Los tipos de IVA general,
// reducido y superreducido son del 21%, 10% y 4% respectivamente.
// Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no
// se aplica promoción, el precio se reduce a la mitad,
// se descuentan 5 euros o se descuenta el 5%.
// El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        double baseImponible;
        String tipoIvaEntrada, codPromoEntrada;
        double ivaAplicado = 0;
        double totalIva = 0;
        double precioConIva = 0;
        double descuento = 0;
        double total = 0;

        do {
            baseImponible = EntradaTeclado.pedirDoble("Introduzca la base imponible");
        } while (baseImponible <= 0);

        do {
            tipoIvaEntrada = EntradaTeclado.pedirCadena("Introduzca el tipo de IVA");
        } while (!(tipoIvaEntrada.equalsIgnoreCase("general")
                || tipoIvaEntrada.equalsIgnoreCase("reducido")
                || tipoIvaEntrada.equalsIgnoreCase("superreducido")));

        do {
            codPromoEntrada = EntradaTeclado.pedirCadena("Introduzca el codigo promocional");
        } while (!(codPromoEntrada.equalsIgnoreCase("nopro")
                || codPromoEntrada.equalsIgnoreCase("mitad")
                || codPromoEntrada.equalsIgnoreCase("meno5")
                || codPromoEntrada.equalsIgnoreCase("5porc")));

        switch (tipoIvaEntrada) {
            case "general" -> {
                ivaAplicado = 0.21;
                totalIva = baseImponible * ivaAplicado;
            }
            case "reducido" -> {
                ivaAplicado = 0.1;
                totalIva = baseImponible * ivaAplicado;
            }
            case "superreducido" -> {
                ivaAplicado = 0.04;
                totalIva = baseImponible * ivaAplicado;
            }
        }

        precioConIva = baseImponible + totalIva;


        switch (codPromoEntrada){

            case "nopro" -> descuento = 0;
            case "mitad" -> descuento = precioConIva * 0.5;
            case "meno5" -> descuento = 5;
            case "5porc" -> descuento = precioConIva * 0.05;
        }

        total = precioConIva - descuento;


        String salida = "Base imponible " + baseImponible +
                "\n IVA(" + ivaAplicado * 100 + ") " + totalIva +
                "\n Precio con IVA " + precioConIva +
                "\n Cod. promo. (" + codPromoEntrada + ") -" + descuento +
                "\n TOTAL " + total;

        System.out.println(salida);


//        Map<String, Double> tiposIva = new HashMap<>();
//        tiposIva.put("general",0.21);
//        tiposIva.put("reducido",0.10);
//        tiposIva.put("superreducido",0.04);
//
//        Map<String, Double> codPromocional = new HashMap<>();
//        codPromocional.put("nopro", 1.0);
//        codPromocional.put("mitad", 0.5);
//        codPromocional.put("meno5", 5.0);
//        codPromocional.put("nopro", 0.95);
//
//        double baseImponible = EntradaTeclado.pedirDoble("Introduzca la base imponible");
//        String ivaEntrada = EntradaTeclado.pedirCadena("Introduzca el tipo de IVA");
//        String codPromEntrada = EntradaTeclado.pedirCadena("Introduzca el codigo promocional");
//
//        Double ivaAplicado = tiposIva.get(ivaEntrada);
//        Double codPromAplicado = codPromocional.get(codPromEntrada);
//
//        Double totalIva = baseImponible * ivaAplicado;
//        Double precioConIva = baseImponible + totalIva;
//        Double promocion = precioConIva * codPromAplicado;
//        Double total = precioConIva - promocion;
//
//        String salida = "Base imponible " + baseImponible +
//                        "\n IVA(" + ivaAplicado * 100 + ") " + totalIva +
//                        "\n Precio con IVA " + precioConIva +
//                        "\n Cod. promo. (" + codPromEntrada + ") " + promocion +
//                        "\n TOTAL " + total;
//
//        System.out.println(salida);


    }
}