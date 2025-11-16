package pe.edu.tecsup._08.exceptions.metodos;

public class Aplicacion {

    public static void main(String[] args) {

        int nro[] = {1123216, 2, 3, 4, 5, 6, 7, 12, 9, 13, 11, 12, 18, 14, 15};

        try {

            /*
            for (int i = 0; i < nro.length; i++) {
                if (nro[i] == 13) {
                    throw new Exception("Número anomalo " + nro[i]);
                }
                System.out.println("Elemento : " + nro[i]);
            }

            int valor = nro[20];
            */

            int valor;

            System.out.println("Inicio del proceso...");

            valor =  obtenerValor(nro, 5);
            System.out.println("Valor obtenido: " + valor);

//            valor =  obtenerValor(nro, 15);
//            System.out.println("Valor obtenido: " + valor);

//            valor =  obtenerValor(nro, -1);
//            System.out.println("Valor obtenido: " + valor);

//            valor =  obtenerValor(null, 5);
//            System.out.println("Valor obtenido: " + valor);

            valor =  obtenerValor(nro, 0);
            System.out.println("Valor obtenido: " + valor);

            System.out.println("Fin del proceso...");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error de indice fuera de rango: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error general: " + e.getMessage());
        } finally {
            System.out.println("Finalizo el bloque try-catch");
        }

    }

    /**
     * Regla de negocio : Prohibir la lectura del primer dato
     *
     * @param arreglo
     * @param indice
     * @return
     */
    protected static int obtenerValor(int[] arreglo, int indice) throws Exception {

        if (arreglo == null) {
            throw new NullPointerException("El arreglo no puede ser nulo");
        }

        if (indice < 0 || indice >= arreglo.length) {
            throw new ArrayIndexOutOfBoundsException("Indice fuera de rango: " + indice);
        }

        if (indice == 0) {
            throw new Exception("No se permite leer el primer elemento");
        }

        return arreglo[indice];

    }

}
