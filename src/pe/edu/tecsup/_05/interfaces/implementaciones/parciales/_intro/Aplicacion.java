package pe.edu.tecsup._05.interfaces.implementaciones.parciales._intro;

public class Aplicacion {

	public static void main(String[] args) {
		
		//PersonaIncompleta persona = new PersonaIncompleta();
        PersonaIncompleta persona = new Persona();
		
		persona.setNombres("Ellzabeth");
		
		persona.setApellidos("Garcia");
		
		// Llamo al comportamiento cantar
		persona.cantar();

		// Llamo al comportamiento correr
		persona.correr();
	}

}
