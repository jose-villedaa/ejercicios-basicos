package org.josevilleda.system;
import java.util.Scanner;
/*
 * @author: Jose Mauricio Villeda Morales 
 * jvilleda-2021075@kinal.edu.gt
 * Grupo: 2
 * Codigo Tecnico: IN5BM 
 * Carne: 2021075
 */

public class Ejercicio2 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int year;

	System.out.println("Ingrese el año en formato (YYYY)");
	year = in.nextInt();

	if (((year % 4 == 0) &&(year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("El año es bisiesto");
	} else {
            System.out.println("El año no es bisiesto");
	}
	 	

    }
}
    
    

