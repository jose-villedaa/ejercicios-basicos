package org.josevilleda.system;
import java.util.Scanner;
/*
 * @author: Jose Mauricio Villeda Morales 
 * jvilleda-2021075@kinal.edu.gt
 * Grupo: 2
 * Codigo Tecnico: IN5BM 
 * Carne: 2021075
 */

public class Ejercicio4 {
    public static void main (String [] args){

	Scanner in = new Scanner(System.in);

	System.out.println("Ingrese la catidad de numeros que desea generar: ");
	int limite = in.nextInt();

	int num1 = 0;
	int num2 = 1;
	int temp;
	int conta = 2;

	System.out.println("\n" + num1 + " \t");
	System.out.println(num2 + " \t");

	while (conta < limite) {
		temp = num1;
		num1 = num2;
		num2 = temp + num1;
		System.out.println(num2 + " \t");
		conta ++;
	}
	System.out.println("\n");
        System.out.println("Ha generado: " + limite + " numeros de la sucesion de fibonacci.");
    }
}
