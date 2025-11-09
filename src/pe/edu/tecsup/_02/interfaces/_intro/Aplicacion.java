package pe.edu.tecsup._02.interfaces._intro;

public class Aplicacion {

    public static void main(String[] args) {

        ComoDeboHacerlo obj = new ComoDeboHacerlo();
        int suma = obj.sumar(10, 5);
        int resta = obj.restar(10, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);

    }
}
