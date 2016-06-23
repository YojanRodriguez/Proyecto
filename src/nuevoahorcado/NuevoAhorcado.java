/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoahorcado;

/**
 *
 * @author Yojan Rodriguez
 */
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class NuevoAhorcado {
    
     //Inicio de todo lo programado
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner leer = new Scanner(System.in);
        //
        
        
        
        int obcion=Integer.parseInt(JOptionPane.showInputDialog(" 1) Fácil"
                + "\n 2) Media"
                + "\n 3) Difícil"
                + "\nElige una opción:  " ));

        switch (obcion) {
            case 1:
                
                JOptionPane.showMessageDialog(null, "Has elegido la modalidad Fácil  ");
                             
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Has elegido la modalidad Media  ");
                
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Has elegido la modalidad Difícil ");
                
                break;
            default:
                 JOptionPane.showMessageDialog(null, "No has elegido una opción del menú  ");
               

        }
 
    }

}
