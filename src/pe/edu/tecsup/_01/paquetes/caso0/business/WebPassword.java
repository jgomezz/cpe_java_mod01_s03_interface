package pe.edu.tecsup._01.paquetes.caso0.business;

public class WebPassword extends GeneralPassword {

    public String procesar(String msg){

        //String k = keyword;

        // Accediendo al atributo protected de la clase base
        String v = super.version;

        //System.out.println("Keyword: " + k);
        System.out.println("Version: " + v);


        String encrypted = super.encrytarWord(msg);


        return encrypted;
    }

}
