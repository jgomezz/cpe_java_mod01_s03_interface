package pe.edu.tecsup._03.interfaces.referencia.ejercicio;

public class Aplicacion {

    public static void main(String[] args) {

        CaracteristicasAnimal caracteristicas;

        caracteristicas = new Gato();
        System.out.println("Gato:");
        imprimirCaracteristicas(caracteristicas);

        System.out.println();

        caracteristicas = new Perro();
        System.out.println("Perro:");
        imprimirCaracteristicas(caracteristicas);

    }


    static void  imprimirCaracteristicas(CaracteristicasAnimal caracteristicas) {

        System.out.println("Que comen: " + caracteristicas.queComen());
        System.out.println("Horas que duermen: " + caracteristicas.cuantasHorasDuermen());
        System.out.println("Razas que existen: " + caracteristicas.cuantasRazasExisten());
        System.out.println("Son herviboros: " + caracteristicas.sonHerviboros());

    }

}
