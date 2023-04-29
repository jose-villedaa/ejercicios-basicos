package org.josevilleda.system;
import java.util.Scanner;
/*
 * @author: Jose Mauricio Villeda Morales 
 * jvilleda-2021075@kinal.edu.gt
 * Grupo: 2
 * Codigo Tecnico: IN5BM 
 * Carne: 2021075
 */

public class Ejercicio6 {
    public static void main (String [] args){

	Scanner in = new Scanner(System.in);

	int contador = 0;

	for (int i = 1; i <= 10; i++){
            System.out.println("Nota del alumno: ");
		int nota = in.nextInt();

	if(nota >= 61){
            contador++;
            }
	}
	
	System.out.println("Cantidad de aprobados: " + contador);

    }
}

