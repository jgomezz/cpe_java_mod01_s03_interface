package pe.edu.tecsup._09.object;

public class Persona   {

	private Integer codigo;
	
	private String nombre;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Persona) {
		
			Persona persona = (Persona) obj;
			
			// Cuales son tus criterios para comparar contenidos
			// entre objetos
			if(persona.getCodigo().equals(this.codigo) && 
					persona.getNombre().equals(this.nombre)) {
				return true;
			}
		}
		
		return false;
	}

}
