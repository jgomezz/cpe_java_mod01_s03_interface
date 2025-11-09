package pe.edu.tecsup._01.paquetes.caso0.app;

import pe.edu.tecsup._01.paquetes.caso0.business.WebPassword;

public class Aplicacion {

    public static void main(String[] args) {

        WebPassword wp = new WebPassword();
        String msg = "Enviame tu DNI";
        String encrypted = wp.procesar(msg);
        System.out.println("Mensaje Encriptado: " + encrypted);


    }

}
