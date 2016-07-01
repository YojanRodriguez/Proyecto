/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoahorcado;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Yojan Rodriguez Jimenez
 */
public class facil {

    /**
     *
     */
    public facil() {

        Scanner deteccion = new Scanner(System.in);
                        //arreglo lleno
        String[] palabrasFacil = {"ana", "ala","uno","año","fin","dos","sol"};
        int random1 = new Random().nextInt(palabrasFacil.length);// Escoje una palabra al azar
        String seleccionada1 = palabrasFacil[random1];//variable que almacena la longitud de la palabra y la palabra

        System.out.println("Esta palabra tiene " + seleccionada1.length() + " letras" + "\n");
        String[] palabra = new String[seleccionada1.length()];//si se llena todos los espacios de este arrglo es que ha ganado el juego
        imprimirPalabra(palabra);//Mostramos las rayitas
        int vidas = 11;//Contador de vidas

        while (true) {

            System.out.println("Escoge una letra");
            String letraElegidaPorUsuario = deteccion.nextLine();
            String[] letras = seleccionada1.split("");
            int contador = 0;

            boolean acertoAlguna = false;
            //Recorremos cada letra de la palabra para comprobar si hay una igualdad
            for (String letra : letras) {
                if (letraElegidaPorUsuario.equals(letra)) {
                    palabra[contador - 1] = letraElegidaPorUsuario;

                    acertoAlguna = true;

                }
                contador++;
            }
            if (acertoAlguna) {

                JOptionPane.showMessageDialog(null, "Has acertado una letra"
                        + "\n Te quedan " + vidas + " vidas");

            } else {
                vidas--;
                JOptionPane.showMessageDialog(null, "No has acertado ninguna letra");
                System.out.println();
                if (vidas == 0) {
                    JOptionPane.showMessageDialog(null, "SE A TERMINADO LA PARTIDA  ╥﹏╥ ", "PERDISTE",JOptionPane.ERROR_MESSAGE);
                    break;
                } else {
                    System.out.println("Te quedan " + vidas + " vidas");
                }
            }

            System.out.println("Las letras encontradas son: ");
            imprimirPalabra(palabra);
            contador = 0;
            acertoAlguna = false;
            if (fin(palabra)) {

                JOptionPane.showMessageDialog(null, "Has completado la palabra", "Felicidades", JOptionPane.INFORMATION_MESSAGE);

                break;

            }
        }
    }

    /**
     *
     * @param palabra
     */
    public void imprimirPalabra(String[] palabra) {
        //Este metodo imprime las letras que ha acertado el usuario hasta el momento.
        for (String letra : palabra) {
            if (letra != null) {
                System.out.print(letra + " "); //Imprime las letras + un espacio
            } else {
                System.out.print(" _ ");  //Imprime las rallitas + un espacio
            }

        }
        System.out.println("");
    }

    /**
     *
     * @param palabra
     * @return
     */
    public boolean fin(String[] palabra) {
        boolean fin = true;

        for (String letra : palabra) {
            if (letra == null) {
                fin = false;
                break;
            }
        }

        return fin;
    }

}
