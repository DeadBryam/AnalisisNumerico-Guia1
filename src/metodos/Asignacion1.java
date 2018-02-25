/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Celia
 */
public class Asignacion1 {

    public Asignacion1() {
    }

    public double x1, x2;

    public double calcularX1(double a, double b, double c, int cifras) {
        a = redondearNumero(a, cifras);
        System.out.println(a);
        b = redondearNumero(b, cifras);
        System.out.println(b);
        c = redondearNumero(c, cifras);
        System.out.println(c);

        x1 = (2 * c) / ((-b) + redondearNumero(Math.sqrt(redondearNumero((b * b), cifras) - redondearNumero((4 * a * c), cifras)), cifras));
        return redondearNumero(x1, cifras);

    }

    public double redondearNumero(double numD, int cifras) {
        String numS, entero = "";
        int i = cifras;
        double parteEntera = 0.0;
        boolean positivo = true;

        if (numD > 0.0) {
            parteEntera = Math.floor(numD);
            numD = numD - parteEntera;
            positivo = true;
        } else if (numD < 0.0) {
            numD = numD * -1;
            parteEntera = Math.floor(numD);
            numD = numD - parteEntera;
            positivo = false;
        }

        if (numD == 0.0 && positivo) {
            return parteEntera;
        } else if (numD == 0.0) {
            return parteEntera * -1;
        }
        
        do {
            entero = String.format("%." + i + "f", numD);
            entero = entero.replaceAll(",", ".");
            i++;
        } while (Double.parseDouble(entero) == 0.0);

        numS = entero;

        if (positivo == true) {
            return Double.parseDouble(numS) + parteEntera;
        } else {
            return (Double.parseDouble(numS) + parteEntera) * -1;
        }
    }

    public double calcularX2(double a, double b, double c, int cifras) {
        a = redondearNumero(a, cifras);
        b = redondearNumero(b, cifras);
        c = redondearNumero(c, cifras);

        x1 = (2 * c) / ((-b) - redondearNumero(Math.sqrt(redondearNumero((b * b), cifras) - redondearNumero((4 * a * c), cifras)), cifras));
        return redondearNumero(x1, cifras);

    }

    public double valorRealX1(double a, double b, double c) {

        return x1 = (2 * c) / ((-b) + Math.sqrt((b * b) - 4 * a * c));
    }

    public double valorRealX2(double a, double b, double c) {

        return x1 = (2 * c) / ((-b) - Math.sqrt((b * b) - 4 * a * c));
    }
    
}
