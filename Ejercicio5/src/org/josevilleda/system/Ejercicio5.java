package org.josevilleda.system;
import java.util.Scanner;
/*
 * @author: Jose Mauricio Villeda Morales 
 * jvilleda-2021075@kinal.edu.gt
 * Grupo: 2
 * Codigo Tecnico: IN5BM 
 * Carne: 2021075
 */

public class Ejercicio5 {
    public static void main (String [] args){

	Scanner in = new Scanner(System.in);

	System.out.println("Ingrese un numero: ");
	int numero = in.nextInt();

	for (int i = 1; i <= numero; i++){
            System.out.println("\nTabla del " + i);

	for (int j = 1; j <= 10; j++){
            System.out.println(i + " x " + j + " = " + (i * j));

            }
	}
    }
}