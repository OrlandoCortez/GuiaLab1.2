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
public class IngresarNumero {
    public static void main(String[] args) {
        int may=0, men=0, Numb;
        String numero;
        numero = JOptionPane.showInputDialog("Cuantos numeros desea agregar:");
        Numb = Integer.parseInt(numero); 
        int [] num = new int[Numb];
        int contador=0, i=1;
        int pares=0;
        while(contador<Numb)
        {
            num[contador] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+i));
            while(num[contador]<=0)
                    {
                      num[contador]=Integer.parseInt(JOptionPane.showInputDialog("Los valores negativos no estan permitidos \nIngrese de nuevo el numero "+i));
                    }
            if(num[contador]>may)
                {
                    may = num[contador];
                }
            if (men==0)
            {
                men=num[contador];
            }
            else
            {
                if(num[contador]<men)
                    {
                        men = num[contador];
                    }
            }
            if(num[contador]%2==0)
            {
                pares++;
            }
            i++;
            contador++;
        }
        JOptionPane.showMessageDialog(null,"El numero mayor es: " + may
        + "\nEl numero menor es: " + men + "\nEl numero de pares es: " + pares);
        System.exit(0);
    }
}
