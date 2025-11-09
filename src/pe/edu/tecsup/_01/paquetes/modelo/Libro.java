package pe.edu.tecsup._01.paquetes.modelo;

public class Libro {

    String autor;
    String titulo;
    int fechaPublicacion;
    String genero;
    
    public Libro(String autor, String titulo, int fechaPublicacion, String genero) {
        super();
        this.autor = autor;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro [autor=" + autor + ", titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion + ", genero=" + genero + "]";
    }
    
    
}
