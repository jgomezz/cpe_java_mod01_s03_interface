package pe.edu.tecsup._08.exceptions._intro;

public class Aplicacion {

    public static void main(String[] args) {
        //           0  1   2  3
        int nro[] = {12,23,33};

        try {
            System.out.println(nro[3]);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(e.getClass());
            e.printStackTrace();
        }
        //System.out.println(nro[3]);


    }
}
