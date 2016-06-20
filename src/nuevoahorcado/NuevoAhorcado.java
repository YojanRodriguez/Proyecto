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

public class NuevoAhorcado {

    //Inicio de todo lo programado
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner leer = new Scanner(System.in);

        System.out.println(" 1) Fácil"
                + "\n 2) Media"
                + "\n 3) Difícil"
                + "\nElige una opción:  ");
        n = leer.nextInt();

        switch (n) {
            case 1:
                System.out.println("Has elegido la modalidad Fácil  ");
                break;
            case 2:
                System.out.println("Has elegido la modalidad Media  ");
                break;
            case 3:
                System.out.println("Has elegido la modalidad Difícil ");
                break;
            default:
                System.out.println("No has elegido una opción del menú  ");

        }

    }

}
