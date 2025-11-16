package pe.edu.tecsup._08.exceptions._3_personalizado;

public class SinFondosException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SinFondosException() {
		super();
	}

	/**
	 * Constructor
	 * @param mensaje
	 */
	public SinFondosException(String mensaje) {
		// Llamando al Constructor de la clase base. 
		super("No hay fondos suficientes --> " + mensaje);
	}
	


}
