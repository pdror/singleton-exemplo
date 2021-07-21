package Singleton;

public class Quadrado {
    private int lados;

    private Quadrado() { }

    public static Quadrado getInstance() {
        return new Quadrado();
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getLados() {
        return this.lados;
    }

    @Override
    public String toString() {
        return "Quadrado com lados = " + getLados();
    }
}
