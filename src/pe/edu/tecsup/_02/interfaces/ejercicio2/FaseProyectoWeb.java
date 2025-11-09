package pe.edu.tecsup._02.interfaces.ejercicio2;

public class FaseProyectoWeb implements FaseProyecto {
    @Override
    public void iniciar() {
        // TODO Auto-generated method stub
    	System.out.println("Iniciando Proyecto Web");

    }
    @Override
    public void analizar() {
    	System.out.println("Analizando Proyecto Web");
    }
    
    @Override
    public void disenhar() {
    	System.out.println("Disehando el Proyecto Web");
    }
    @Override
    public void construir() {
        // TODO Auto-generated method stub
    }
    @Override
    public void probar() {
        // TODO Auto-generated method stub
    }
    @Override
    public void implantar() {
        // TODO Auto-generated method stub
    }
	@Override
	public String obtenerEstado() {
		// TODO Auto-generated method stub
		return "Pruebas";
	}
}