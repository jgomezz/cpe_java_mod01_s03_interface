package pe.edu.tecsup._03.interfaces.referencia.ejercicio;

public class Perro implements CaracteristicasAnimal{
    @Override
    public String queComen() {
        return "Comen gatos";
    }

    @Override
    public int cuantasHorasDuermen() {
        return 8;
    }

    @Override
    public int cuantasRazasExisten() {
        return 100;
    }

    @Override
    public boolean sonHerviboros() {
        return false;
    }

    @Override
    public String dameTipoAnimal() {
        return "Perro";
    }
}
