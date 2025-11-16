package pe.edu.tecsup._09.record._01_intro;

/**
 *  Solo son de modo lectura . Inmutables
 * @param codigo
 * @param nombre
 */
public record Persona(Integer codigo, String nombre) {

    @Override
    public String toString() {
        return "PersonaRecord [codigo=" + codigo + ", nombre=" + nombre + "]";
    }
}
