package pe.edu.tecsup._02.interfaces._intro;

public class Aplicacion {

    public static void main(String[] args) {

        // Interface : queDebesHacer = Clase : new ComoDeboHacerlo();
        QueDebesHacer obj = new ComoDeboHacerlo();
        int suma = obj.sumar(10, 5);
        int resta = obj.restar(10, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);

        // Interface : queDebesHacer = Clase : new ComoLoHacenLosGenios();
        QueDebesHacer obj2 = new ComoLoHacenLosGenios();
        int suma2 = obj2.sumar(10, 5);
        int resta2 = obj2.restar(10, 5);

        System.out.println("Suma2: " + suma2);
        System.out.println("Resta2: " + resta2);


        QueDebesHacer obj3 = null;
        int suma3 = obj3.sumar(10, 5);
        int resta3 = obj3.restar(10, 5);

        System.out.println("Suma3: " + suma3);
        System.out.println("Resta3: " + resta3);
    }
}
