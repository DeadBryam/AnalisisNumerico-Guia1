/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Celia
 */
public class Asignacion2 {

    double res, err;
    DefaultTableModel modelo;

    public double getRes() {
        return res;
    }

    public double getErr() {
        return err;
    }

    public DefaultTableModel calcularValor (double x, int cifras) {
        modelo = new DefaultTableModel(new Object[]{"Iteracion", "Resultado", "Error Aproximado"}, 0);
        int i = 0;
        BigDecimal resultado = BigDecimal.ZERO, temp, resultadoAnterior, error;

        do {
            resultadoAnterior = resultado;
            temp = new BigDecimal(String.valueOf((Math.pow((x), i*2))*(Math.pow(-1, i))));
            temp = temp.divide(new BigDecimal(factorial(i*2)), 15, RoundingMode.CEILING);
            resultado = resultado.add(temp);

            error = resultado;
            error = error.subtract(resultadoAnterior);
            error = error.divide(resultado, 15, RoundingMode.CEILING);
            error = error.multiply(new BigDecimal("100"));

            if (i == 0) {
                modelo.addRow(new Object[]{i + 1, resultado, "-------"});
            } else {
                modelo.addRow(new Object[]{i + 1, resultado, error});
            }

            if (error.compareTo(BigDecimal.ZERO) < 0) {
                error = error.multiply(new BigDecimal(String.valueOf("-1")));
            }
            i++;
        } while (error.compareTo(new BigDecimal(String.valueOf(0.5 * Math.pow(10, (2 - cifras))))) > 0);
        res = Double.parseDouble(String.valueOf(resultado));
        err = Double.parseDouble(String.valueOf(error));
        return modelo;
    }
    
    public BigInteger factorial(int n) {
        BigInteger resultado = new BigInteger("1");
        BigInteger it;
        for (int i = n; i > 0; i--) {
            it = new BigInteger(String.valueOf(i));
            resultado = resultado.multiply(it);
        }
        return resultado;
    }

}
