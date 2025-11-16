package pe.edu.tecsup._09.record._01_intro;


public class TestApp1 {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona(100, "Miguel");

		System.out.println("persona1 : " + persona1);
//		System.out.println(persona1.toString());

		Persona persona2 = new Persona(100, "Miguel");

		System.out.println("persona2 : " + persona2);
		
//		Persona persona3 = persona1;
		
		boolean res1 = persona1.equals(persona2);
		System.out.println("Es igual? " + res1);
		
//		boolean res2 = persona1.equals(persona3);
//		System.out.println("Es igual? " + res2);
		
	}

}
