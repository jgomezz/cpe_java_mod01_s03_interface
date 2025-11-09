package pe.edu.tecsup._07.interfaces.nuevas_caracteristicas;

public class Aplicacion {

    public static void main(String[] args) {

        String call = ServiciosTelecomunicaciones.llamarCallCenter();

        System.out.println(call);

        ServiciosTelecomunicaciones st = new ServiciosTelecomunicaciones() {
            @Override
            public void darAltaTelefoniaResidencial() {
            }

            @Override
            public void darAltaTelevisionPorCable() {
            }
        };

        System.out.println(st.darAyudaEnLinea());





    }
}
