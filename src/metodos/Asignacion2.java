/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;


import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Celia
 */
public class Asignacion2 {
    
    double res,err;

    public double getRes() {
        return res;
    }

    public double getErr() {
        return err;
    }
    
   public DefaultTableModel calcularValor(double x, int cifras){
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("Iteracion");
       modelo.addColumn("Resultado");
       modelo.addColumn("Error Aproximado");
       float nivelTolerancia;
       
       nivelTolerancia = (float) (0.5*(Math.pow(10, (2-cifras))));
       int i=1;
       int exp=2;
       int signo=(-1);
       Object[] vector = new Object[3];
       modelo.addRow(new Object[]{1,1,"-"});
       
       do {           
           
           vector[0]=i+1;
           vector[1]=Float.parseFloat(modelo.getValueAt(i-1, 1).toString()) + (float) (Math.pow(x, exp))/(factorial(exp))*(signo);
           vector[2]=(((Float.parseFloat((vector[1]).toString()))-Float.parseFloat(modelo.getValueAt(i-1, 1).toString()))
                   /Float.parseFloat((vector[1]).toString()))*100;
           
           modelo.addRow(vector);
           exp=exp+2;
           signo=signo*(-1);
           i=i+1;
       } while (Math.abs(Float.parseFloat((vector[2]).toString()))>nivelTolerancia);
       
       return modelo;
       
    }
   
   public DefaultTableModel metodo1(int cifras, int x) {
       DefaultTableModel modelo = new DefaultTableModel();
        modelo = new DefaultTableModel(new Object[]{"Iteracion", "Resultado", "Error Aproximado"}, 0);
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
        err= Double.parseDouble(String.valueOf(error));
        return modelo;
    }
   
    public long factorial(int num){
        long res=1;
        for(int i=num; i>0; i--){
            res*=i;
        }
        return res;
    }
    
}
