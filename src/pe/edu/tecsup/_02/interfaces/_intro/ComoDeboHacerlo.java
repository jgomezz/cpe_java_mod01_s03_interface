package pe.edu.tecsup._02.interfaces._intro;

public class ComoDeboHacerlo  implements QueDebesHacer{

    @Override
    public int sumar(int a, int b) {
        return a+b;
    }

    @Override
    public int restar(int a, int b) {
        return a-b;
    }
}
