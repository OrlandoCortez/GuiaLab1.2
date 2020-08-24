/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guialab1.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class DescuentoCliente {

    public static void main(String[] args) {
        String compra;
        int bolita;
        float c, descuento = 0, monto;
        compra = JOptionPane.showInputDialog("Ingrese el monto de la compra: ");
        c = Float.parseFloat(compra);
        compra = JOptionPane.showInputDialog("si la bolita es roja ingrese 1, " + "\n si es verde ingrese 2, " + "si es blanca ingrese, 3");
        bolita = Integer.parseInt(compra);
        switch (bolita) {
            case 1: {
                descuento = c * 0.10f;
                monto = c - descuento;
            }
            break;
            case 2: {
                descuento = c * 0.05f;
                monto = c - descuento;

            }
            break;
            case 3: {
                descuento = 0;
                monto = c - descuento;

            }
            default:
            {
                monto = c;
            }   
            break;
        }
        JOptionPane.showMessageDialog(null,"Su compra es de: $" + c + "\n saco una bolita color: "
        + bolita + "\n se le aplicara un descuento de: $" + descuento + "\n su nuevo total sera: $" + monto);
        System.exit(0);
    }
    

}
