package Singleton;

public class TrianguloEquilatero implements Triangulo {
    private static Triangulo equilatero = null;
    private int lados;

    private TrianguloEquilatero() { }

    public static TrianguloEquilatero getInstance() {
        if(equilatero == null) equilatero = new TrianguloEquilatero();
        return (TrianguloEquilatero) equilatero;
    }

    @Override
    public void setLados(int lados) {
        this.lados = lados;
    }

    @Override
    public int getLados() {
        return this.lados;
    }

    public String toString() {
        return "Triângulo equilatero com lados = " + getLados();
    }
}
