package pe.edu.tecsup._08.exceptions._intro;

public class ExceptionTestMain {

	public static String cadena;
	
	public static void main(String[] args) {
	

		//*
		try {
			// Van sentencias de codigo
			int n = 4/0; // Esto genera una excepcion
			
		} catch (Exception e) {
			// Handle exception
			System.out.println("Hay una anomalia");
		}

		//*/
		
		/*
		try {
			
			cadena = "Un texto de ejemplo...";
			String minuscula = cadena.toLowerCase();
			System.out.println("minuscula: " + minuscula);
			
			int nparticipantes = 20;	
			int nbloques = 0;

			if(nbloques == 0) {
				// lanzar una excepcion controlada
				throw new ArithmeticException("N bloques igual a cero");
			}
			
			System.out.println( nparticipantes/nbloques );
			
			int notas[] = new int[4];
			notas[3] = 16;  // esto genera una exception 
			
		} catch (NullPointerException e) {
			System.err.println("Error null pointer exception");
		} catch (ArithmeticException e) {
			System.err.println("Error en division: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error general: " + e.getMessage());
		}
		
		//System.out.println("Fin de la aplicacion sin problemas");
        //*/
	
	}

}
