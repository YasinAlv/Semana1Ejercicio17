/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.pkg17;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicios17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String Dia;

        System.out.println("Digite un dia de la semana: (Ejm:Lunes)");
        Dia = Teclado.next();
        /*
        if ("Lunes".equals(Dia) == true) {
            System.out.println("Es Laboral");
        } else if ("Martes".equals(Dia) == true) {
            System.out.println("Es Laboral");
        } else if ("Miercoles".equals(Dia) == true) {
            System.out.println("Es Laboral");
        } else if ("Jueves".equals(Dia) == true) {
            System.out.println("Es Laboral");
        } else if ("Viernes".equals(Dia) == true) {
            System.out.println("Es Laboral");
        } else if ("Sabado".equals(Dia) == true) {
            System.out.println("No es Laboral");
        } else if ("Domingo".equals(Dia) == true) {
            System.out.println("No es Laboral");
        } else {
            System.out.println("No digitate un día de la semana correcto");
        }*/

        switch (Dia) {

            case "Lunes":
                System.out.println("Es Laboral");
                break;
            case "Martes":
                System.out.println("Es Laboral");
                break;
            case "Miercoles":
                System.out.println("Es Laboral");
                break;
            case "Jueves":
                System.out.println("Es Laboral");
                break;
            case "Viernes":
                System.out.println("Es Laboral");
                break;
            case "Sabado":
                System.out.println("No es Laboral");
                break;
            case "Domingo":
                System.out.println("No es Laboral");
                break;
            default:
                System.out.println("No digito un día de la semana valido");
                break;
        }

    }

}
