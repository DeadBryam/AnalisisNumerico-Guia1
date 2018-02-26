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
 * @author villa
 */
public class Asignacion3 {

    int iteracion;
    double vv, res1, er1;
    DefaultTableModel model1 = new DefaultTableModel(new Object[]{"Iteracion", "Resultado", "Error Aproximado"}, 0);

    public Asignacion3() {
    }

    public double getVv() {
        return vv = Math.exp(-5);
    }

    public double getRes1() {
        return res1;
    }

    public double getEr1() {
        return er1;
    }

    public BigInteger factorial(int n) {
        BigInteger res = new BigInteger("1");
        BigInteger it;
        for (int i = n; i > 0; i--) {
            it = new BigInteger(String.valueOf(i));
            res = res.multiply(it);
        }
        return res;
    }

    public DefaultTableModel metodo1(int cifras, int x) {
        int i = 0;
        BigDecimal resultado = BigDecimal.ZERO, temp, resultadoAnterior, error;

        do {
            resultadoAnterior = resultado;
            temp = new BigDecimal(String.valueOf(Math.pow((-x), i)));
            temp = temp.divide(new BigDecimal(factorial(i)), 15, RoundingMode.CEILING);
            resultado = resultado.add(temp);

            error = resultado;
            error = error.subtract(resultadoAnterior);
            error = error.divide(resultado, 15, RoundingMode.CEILING);
            error = error.multiply(new BigDecimal("100"));

            //System.out.println(resultado + "\t" + error);
            model1.addRow(new Object[]{i, resultado, error});
            if (error.compareTo(BigDecimal.ZERO) < 0) {
                error = error.multiply(new BigDecimal(String.valueOf("-1")));
            }
            i++;
        } while (error.compareTo(new BigDecimal(String.valueOf(0.5 * Math.pow(10, (2 - cifras))))) > 0);
        res1 = Double.parseDouble(String.valueOf(resultado));
        er1 = Double.parseDouble(String.valueOf(error));
        return model1;
    }

}
