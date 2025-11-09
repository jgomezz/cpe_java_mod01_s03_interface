package pe.edu.tecsup._01.paquetes.caso0.business;

public class GeneralPassword {

    private String keyword = "ABC123";

    protected String version = "1.0";

    protected String encrytarWord(String word) {
        return this.keyword + word + this.version;
    }
}
