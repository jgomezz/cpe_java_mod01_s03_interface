package pe.edu.tecsup._03.interfaces.referencia.ejercicio;

public class Aplicacion {

    public static void main(String[] args) {

        CaracteristicasAnimal gato = new Gato();

        System.out.println("Gato:");
        System.out.println("Que comen: " + gato.queComen());
        System.out.println("Horas que duermen: " + gato.cuantasHorasDuermen());
        System.out.println("Razas que existen: " + gato.cuantasRazasExisten());
        System.out.println("Son herviboros: " + gato.sonHerviboros());

        System.out.println();

        CaracteristicasAnimal perro = new Perro();
        System.out.println("Perro:");
        System.out.println("Que comen: " + perro.queComen());
        System.out.println("Horas que duermen: " + perro.cuantasHorasDuermen());
        System.out.println("Razas que existen: " + perro.cuantasRazasExisten());
        System.out.println("Son herviboros: " + perro.sonHerviboros());

    }
}
