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

//    
    public static void main(String[] args) {
//        String[] asd = new String[10];

        int x = 0;

        try {

            while (true) {

                x = Integer.parseInt(JOptionPane.showInputDialog("MENÙ DE DIFICILTAD"
                        + "\n 1)-Facil"
                        + "\n 2)-Medio"
                        + "\n 3)-Dificil"
                        + "\n 4)-Salir\n"
                        + "\n Digite un nùmero: "));

                switch (x) {

                    case 1:

                        JOptionPane.showMessageDialog(null, "Estas en modalidad facil");
                        x = Integer.parseInt(JOptionPane.showInputDialog("\ncontinuar ( 1)" + "\nIr al menú ( 2)"));
                        if (x < 2) {

                            NuevoAhorcado salida = new NuevoAhorcado();
                            break;
                        } else {

                            x = 4;
                            break;
                        }
                    case 2:
                        JOptionPane.showMessageDialog(null, "Estas en modalidad media");
                        x = Integer.parseInt(JOptionPane.showInputDialog("\ncontinuar ( 1)" + "\nIr al menú ( 2)"));
                        if (x < 2) {
                            medio salida2 = new medio();
                            break;
                        } else {

                            break;
                        }
                    case 3:

                        JOptionPane.showMessageDialog(null, "Estas en modalidad Dificil");
                        x = Integer.parseInt(JOptionPane.showInputDialog("\ncontinuar ( 1)" + "\nIr al menú ( 2)"));
                        if (x < 2) {
                            dificil salida3 = new dificil();
                            break;
                        } else {

                            break;
                        }
                    case 4:
                        JOptionPane.showMessageDialog(null, "Saliendo");
                        System.exit(4);

                }
                JOptionPane.showMessageDialog(null, "Volviendo al menú", "Continuar...", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Uoop! Error!", "OOhhhh", JOptionPane.ERROR_MESSAGE);

        }
    }
}
