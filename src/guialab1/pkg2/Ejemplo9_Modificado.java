/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guialab1.pkg2;

/**
 *
 * @author GUILLERMO
 */
import javax.swing.JOptionPane;

public class Ejemplo9_Modificado {

    public static void main(String[] args) {
// TODO code application logic here
        String leer;
        double sueldo, mayor = 0, menor = 10000;
        int i = 1, contador = 0;
        while (i <= 5) {
            leer = JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " + i);
            sueldo = Double.parseDouble(leer);
            while (sueldo < 0) {
                leer = JOptionPane.showInputDialog("ERROR, el sueldo no puede ser Negativo\nIngrese el sueldo del empleado: " + i);
                sueldo = Double.parseDouble(leer);
            }
            if (sueldo > 300) {
                contador = contador + 1;
            }
            if (sueldo > mayor) {
                mayor = sueldo;
            }
            if (sueldo < menor) {
                menor = sueldo;
            }
            i = i + 1;
        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor
                + "\nEl sueldo Menor es de $: " + menor
                + "\n" + contador + " Empleados tienen un sueldo mayor de $300");

        System.exit(0);
    }
}
