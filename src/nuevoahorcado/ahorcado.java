/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoahorcado;

import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class ahorcado {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
//        String[] asd = new String[10];

        int x = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog("MENÙ DE DIFICILTAD"
                + "\n 1)-Facil"
                + "\n 2)-Medio"
                + "\n 3)-Dificil\n"
                + "\n Digite un nùmero: "));
        switch (x) {
            
            case 0:

            case 1:
                JOptionPane.showMessageDialog(null, "Estas en modalidad facil");
                NuevoAhorcado salida = new NuevoAhorcado();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Estas en modalidad media");
                medio salida2 = new medio();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Estas en modalidad Dificil");
                dificil salida3 = new dificil();
                break;

            default:
                JOptionPane.showMessageDialog(null, "NO INGRESO NINGUN NÙMERO");
                ahorcado salida0 = new ahorcado();

        }

    }

}
