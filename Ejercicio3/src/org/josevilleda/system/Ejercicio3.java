package org.josevilleda.system;
import java.util.Scanner;
/*
 * @author: Jose Mauricio Villeda Morales 
 * jvilleda-2021075@kinal.edu.gt
 * Grupo: 2
 * Codigo Tecnico: IN5BM 
 * Carne: 2021075
 */

public class Ejercicio3 {
    public static void main (String [] args){

	Scanner in = new Scanner(System.in);

	System.out.println("Ingrese un numero: ");
	int limite = in.nextInt();

	int numero = 0;

	while (numero <= limite){
		if (numero % 2 != 0){
			System.out.println(numero);
		}
		numero ++;
	}
    }
}

