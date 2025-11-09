package pe.edu.tecsup._03.interfaces.referencia.ejercicio;

public class Ave implements CaracteristicasAnimal{
    @Override
    public String queComen() {
        return "come semillas";
    }

    @Override
    public int cuantasHorasDuermen() {
        return 10;
    }

    @Override
    public int cuantasRazasExisten() {
        return 80;
    }

    @Override
    public boolean sonHerviboros() {
        return true;
    }

    @Override
    public String dameTipoAnimal() {
        return "Ave";
    }
}
