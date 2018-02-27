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
        b = redondearNumero(b, cifras);
        c = redondearNumero(c, cifras);

        x1 = (2 * c) / redondearNumero(((-b) + redondearNumero(Math.sqrt(redondearNumero((b * b), cifras) - redondearNumero((4 * a * c), cifras)), cifras)), cifras);
        System.out.println((2 * c) / redondearNumero(((-b) + redondearNumero(Math.sqrt(redondearNumero((b * b), cifras) - redondearNumero((4 * a * c), cifras)), cifras)), cifras));
        return x1;

    }

    public double redondearNumero(double numero, int cifras) {
        boolean positivo = false;
        double parteEntera = 0, aux;
        int i = 0;

        if (numero > 0.0) {
            parteEntera = Math.floor(numero);
            numero -= parteEntera;
            positivo = true;
        } else if (numero < 0.0) {
            numero *= -1;
            parteEntera = Math.floor(numero);
            numero -= parteEntera;
            positivo = false;
        }

        if (numero == 0.0 && positivo) {
            return parteEntera;
        } else if (numero == 0.0) {
            return parteEntera * -1;
        }

        do {
            aux = numero * Math.pow(10, cifras + i);
            i++;
        } while (Math.floor(aux) == 0);
        i--;
        numero *= Math.pow(10, cifras + i);
        numero = Math.round(numero);
        numero /= Math.pow(10, cifras + i);

        if (positivo == true) {
            return numero + parteEntera;
        } else {
            return (numero + parteEntera) * -1;
        }
    }

    public double calcularX2(double a, double b, double c, int cifras) {
        a = redondearNumero(a, cifras);
        b = redondearNumero(b, cifras);
        c = redondearNumero(c, cifras);

        x1 = (2 * c) / ((-b) - redondearNumero(Math.sqrt(redondearNumero((b * b), cifras) - redondearNumero((4 * a * c), cifras)), cifras));
        return x1;
    }

    public double valorRealX1(double a, double b, double c) {
        return x1 = (2 * c) / ((-b) + Math.sqrt((b * b) - 4 * a * c));
    }

    public double valorRealX2(double a, double b, double c) {
        return x1 = (2 * c) / ((-b) - Math.sqrt((b * b) - 4 * a * c));
    }

}
