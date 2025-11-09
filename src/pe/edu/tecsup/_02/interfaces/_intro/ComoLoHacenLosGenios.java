package pe.edu.tecsup._02.interfaces._intro;

public class ComoLoHacenLosGenios implements QueDebesHacer{
    @Override
    public int sumar(int a, int b) {
        return a + 100 + b - 100;
    }

    @Override
    public int restar(int a, int b) {
        return a - 5 +5 -b;
    }
}
