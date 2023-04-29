package org.josevilleda.system;
import java.util.Scanner;
/*
 * @author: Jose Mauricio Villeda Morales 
 * jvilleda-2021075@kinal.edu.gt
 * Grupo: 2
 * Codigo Tecnico: IN5BM 
 * Carne: 2021075
 */

public class Principal {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        byte edad;
        boolean traeRegalo;

        System.out.println("Ingrese la edad del invitado: ");
        edad = in.nextByte();

        System.out.println("Trae regalo? (true / false)");
        traeRegalo = in.nextBoolean();

        if (edad > 15){
            if (traeRegalo){
                System.out.println("Si puede entrar");
        } else {
                System.out.println("No puede entrar");
                }
        } else {
            if (edad == 15){
                System.out.println("Si puede entrar");
        } else {
            if (edad < 15) {
                System.out.print("No puede entrar");

                }
            }
        }
    }
}
