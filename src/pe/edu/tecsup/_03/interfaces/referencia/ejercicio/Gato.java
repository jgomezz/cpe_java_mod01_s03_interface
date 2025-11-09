package pe.edu.tecsup._03.interfaces.referencia.ejercicio;

public class Gato implements CaracteristicasAnimal{

    @Override
    public String queComen() {
        return "Comen ratones";
    }

    @Override
    public int cuantasHorasDuermen() {
        return 18;
    }

    @Override
    public int cuantasRazasExisten() {
        return 50;
    }

    @Override
    public boolean sonHerviboros() {
        return false;
    }

    @Override
    public String dameTipoAnimal() {
        return "Gato";
    }
}
