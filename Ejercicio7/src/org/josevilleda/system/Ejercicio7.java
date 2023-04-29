package org.josevilleda.system;
import java.util.Scanner;
/*
 * @author: Jose Mauricio Villeda Morales 
 * jvilleda-2021075@kinal.edu.gt
 * Grupo: 2
 * Codigo Tecnico: IN5BM 
 * Carne: 2021075
 */

public class Ejercicio7 {
    public static void main (String [] args){

	Scanner in = new Scanner(System.in);

	double suma = 0.0;
	String respuesta = "";

	do{
            System.out.println("Ingrese un numero: ");
            double numero = in.nextDouble();
            suma = suma + numero;

            System.out.println("Desea ingresar otro numero? (s/n)");
		in.nextLine();
		respuesta = in.nextLine();

	}while (respuesta.equalsIgnoreCase("s"));
		System.out.println("Suma total: " + suma);
    }
}
