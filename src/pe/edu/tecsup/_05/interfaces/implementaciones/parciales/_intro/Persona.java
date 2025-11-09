package pe.edu.tecsup._05.interfaces.implementaciones.parciales._intro;

public  class Persona extends PersonaIncompleta{

    @Override
    public void correr() {
        System.out.println("Me llamo " + this.getNombres() + " y suelo correr por las tardes");
        
    }

}
