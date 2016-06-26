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
public class medio {
    public medio() {

        Scanner deteccion = new Scanner(System.in);

        String[] palabrasFacil = {"carro","perro","ciudad","peces","moneda","lapiz","truco","arroz","pepino","luces","camaron"};
        int random1 = 0 + new Random().nextInt(palabrasFacil.length);
        String seleccionada1 = palabrasFacil[random1];//Guardamos la palabra escogida por la pc en una variable

        System.out.println("Esta palabra tiene " + seleccionada1.length() + " letras"+ "\n");
        String[] palabra = new String[seleccionada1.length()];//si se llena todos los espacios de este array es que ha ganado el juego
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
                    palabra[contador-1] = letraElegidaPorUsuario;
                    acertoAlguna = true;break;
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
                    JOptionPane.showMessageDialog(null, "Se te acabaron las vidas, quedas ahorcado x(");
                    break;
                } else {
                    System.out.println("Te quedan " + vidas + " vidas");
                }
            }
            
            System.out.println("Las letras encontradas son: ");
            imprimirPalabra(palabra);
            contador = 0;
            acertoAlguna = false;
            if (gano(palabra)) {
                
                JOptionPane.showMessageDialog(null,"Has completado la palabra","choose one", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }

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

    public boolean gano(String[] palabra) {
        boolean gano = true;

        for (String letra : palabra) {
            if (letra == null) {
                gano = false;
                break;
            }
        }

        return gano;
    }

}
