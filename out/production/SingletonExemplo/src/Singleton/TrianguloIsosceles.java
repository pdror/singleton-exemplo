package Singleton;

public class TrianguloIsosceles implements Triangulo {
    private static Triangulo isosceles = null;
    private int lados;
    private int base;

    private TrianguloIsosceles() { }

    public static TrianguloIsosceles getInstance() {
        if(isosceles == null) isosceles = new TrianguloIsosceles();
        return (TrianguloIsosceles) isosceles;
    }

    @Override
    public void setLados(int lados) {
        this.lados = lados;
    }

    @Override
    public int getLados() {
        return this.lados;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return this.base;
    }

    public String toString() {
        return String.format("Triângulo isósceles com base = %d e lados congruentes = %d", getBase(), getLados());
    }
}