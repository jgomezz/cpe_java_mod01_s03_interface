package pe.edu.tecsup._08.exceptions.metodos;

public class Aplicacion {

    public static void main(String[] args) {

        int nro[] = {1, 2, 3, 4, 5, 6, 7, 12, 9, 13, 11, 12, 18, 14, 15};

        try {
            for (int i = 0; i < nro.length; i++) {
                if (nro[i] == 13) {
                    throw new Exception("Número anomalo " + nro[i]);
                }
                System.out.println("Elemento : " + nro[i]);
            }

            int valor = nro[20];


        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error de indice fuera de rango: " + e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Finalizo el bloque try-catch");
        }


    }
}
