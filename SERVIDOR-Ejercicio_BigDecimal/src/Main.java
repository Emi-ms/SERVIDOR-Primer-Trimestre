import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal baseImponible;
        String tipoIvaEntrada, codPromoEntrada;
        BigDecimal ivaAplicado = null;
        BigDecimal totalIva = null;
        BigDecimal precioConIva;
        BigDecimal descuento = null;
        BigDecimal total = null;

            baseImponible = BigDecimal.valueOf(EntradaTeclado.pedirDoble("Introduzca la base imponible"));

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
                ivaAplicado = new BigDecimal("0.21");
                totalIva = baseImponible.multiply(ivaAplicado);
            }
            case "reducido" -> {
                ivaAplicado = new BigDecimal("0.1");
                totalIva = baseImponible.multiply(ivaAplicado);
            }
            case "superreducido" -> {
                ivaAplicado = new BigDecimal("0.04");;
                totalIva = baseImponible.multiply(ivaAplicado);
            }
        }

        precioConIva = baseImponible.add(totalIva);


        switch (codPromoEntrada){

            case "nopro" -> descuento = BigDecimal.valueOf(0);
            case "mitad" -> descuento = precioConIva.multiply(BigDecimal.valueOf(0.5));
            case "meno5" -> descuento = BigDecimal.valueOf(5);
            case "5porc" -> descuento = precioConIva.multiply(BigDecimal.valueOf(0.05));
        }

        total = precioConIva.subtract(descuento).setScale(2, RoundingMode.HALF_EVEN);


        String salida = "Base imponible " + baseImponible +
                "\n IVA(" + ivaAplicado.multiply(BigDecimal.valueOf(100))  + "%) " + totalIva +
                "\n Precio con IVA " + precioConIva +
                "\n Cod. promo. (" + codPromoEntrada + ") -" + descuento +
                "\n TOTAL " + total;

        System.out.println(salida);
    }
}