/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoahorcado;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yojan Rodriguez Jimenez
 */
public class ahorcado {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {


        int opcion= 0; //Variable que utilizo para almacenar la opcion de manú

        try {       //Funciona para buscar errores del bloque de código

            while (true) {      //Siempre verdadero para que siga ingresando hasta que de la opcion de salir

                opcion = Integer.parseInt(JOptionPane.showInputDialog("MENÙ DE DIFICILTAD"///////////////
                        + "\n 1)-Facil"                                                   //           //
                        + "\n 2)-Medio"                                                   //           //
                                                                                          // MENUUUUU  //
                        + "\n 3)-Dificil"                                                 //           //
                        + "\n 4)-Salir\n"                                                 //           //
                        + "\n Digite un nùmero: "));                                      ///////////////
                            
              
                switch (opcion) {

                    case 1:             //las opciones de menú facil

                        JOptionPane.showMessageDialog(null, "Estas en modalidad facil");
                                //Pequeño menú de opciones de continuar y volver al menu
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("\ncontinuar ( 1)" + "\nIr al menú ( 2)")); 
                        if (opcion < 2) {

                            facil salida = new facil();  // Llamas la clase facil
                            
                            break;
                        } else {
                            break;
                        }
                    case 2:         //las opciones de menú medio
                        JOptionPane.showMessageDialog(null, "Estas en modalidad media");
                              //Pequeño menú de opciones de continuar y volver al menu
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("\ncontinuar ( 1)" + "\nIr al menú ( 2)"));
                        if (opcion < 2) {
                            medio salida2 = new medio();    // Llamas la clase medio
                            break;
                        } else {
                            break;
                        }
                    case 3:         //las opciones de menú dificil

                        JOptionPane.showMessageDialog(null, "Estas en modalidad Dificil");
                               //Pequeño menú de opciones de continuar y volver al menu
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("\ncontinuar ( 1)" + "\nIr al menú ( 2)"));  
                        if (opcion < 2) {
                            dificil salida3 = new dificil();    // Llamas la clase dificil
                            break;
                        } else {

                            break;
                        }
                    case 4:             //las opciones de menú SALIR
                        JOptionPane.showMessageDialog(null, "Saliendo");
                        System.exit(4);         //lo va a sacar cuando le das la opcion 4

                }
                JOptionPane.showMessageDialog(null, "Volviendo al menú", "Continuar...", JOptionPane.WARNING_MESSAGE);//MENSAJE PARA EXPLICAR LO QUE SUCEDE
            }
            
        } catch (HeadlessException | NumberFormatException e) { //Catch ya se encontro el error por lo tanto el programa ingresa a esta opcion y te muestra un mensaje 
            //Y te saca del programa

            JOptionPane.showMessageDialog(null, "Uoop! Error!", "OOhhhh", JOptionPane.ERROR_MESSAGE); //MENSAJE PARA EXPLICAR LO QUE SUCEDE
        }
    }
}
