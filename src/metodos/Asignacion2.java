/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Celia
 */
public class Asignacion2 {
    
   public double valorReal(double x){
       
       return Math.exp(x);
       
   }
   
   public DefaultTableModel calcularValor(double x, int cifras){
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("Iteracion");
       modelo.addColumn("Resultado");
       modelo.addColumn("Error Aproximado");
       double nivelTolerancia;
       nivelTolerancia = (0.5*Math.pow(10, (2-cifras)));
       int i=1;
       int exp=2;
       int signo=(-1);
       Object[] vector = new Object[3];
       modelo.addRow(new Object[]{1,1,"-"});
       
       do {           
           
           vector[0]=i+1;
           vector[1]=Double.parseDouble(modelo.getValueAt(i-1, 1).toString()) + (Math.pow(x, exp))/(factorial(exp))*(signo);
           vector[2]=(((Double.parseDouble((vector[1]).toString()))-Double.parseDouble(modelo.getValueAt(i-1, 1).toString()))
                   /Double.parseDouble((vector[1]).toString()))*100;
           
           modelo.addRow(vector);
           exp=exp+2;
           signo=signo*(-1);
           i=i+1;
       } while (Math.abs(Double.parseDouble((vector[2]).toString()))>nivelTolerancia);
       
       return modelo;
       
    }
   
    public int factorial(int num){
        int res=1;
        for(int i=num; i>0; i--){
            res*=i;
        }
        return res;
    }
    
}
