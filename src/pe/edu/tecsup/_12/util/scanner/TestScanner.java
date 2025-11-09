package pe.edu.tecsup._12.util.scanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un texto, para contar las letras: ");
		Scanner sc = new Scanner(System.in);		
		String s1 = sc.nextLine();
		System.out.println(s1.length());
		
		
		
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
