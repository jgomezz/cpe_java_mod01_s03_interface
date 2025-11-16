package pe.edu.tecsup._12.util.scanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		System.out.print("Ingrese un texto, para contar las letras: ");
		Scanner sc = new Scanner(System.in);		
		String s1 = sc.nextLine();
		System.out.println("La palabra ingresada tiene : " + s1.length() + " letras.");
		
		
		
	/*	
		String s2 = "Hola";
		
		if(new String("Hola") == s1.substring(0, 3).toString()) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
*/
	}

}
