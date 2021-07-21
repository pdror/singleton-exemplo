package Singleton;

public class TrianguloRetangulo implements Triangulo {
    private static Triangulo retangulo = null;
    private int hipotenusa;
    private int adjacente;
    private int oposto;

    private TrianguloRetangulo() { }

    public static TrianguloRetangulo getInstance() {
        if(retangulo == null) retangulo = new TrianguloRetangulo();
        return (TrianguloRetangulo) retangulo;
    }

    public void setHipotenusa(int hip) {
        this.hipotenusa = hip;
    }

    public void setAdjacente(int adj) {
        this.adjacente = adj;
    }

    public void setOposto(int ops) {
        this.oposto = ops;
    }

    public int getHipotenusa() {
        return this.hipotenusa;
    }

    public int getAdjacente() {
        return this.adjacente;
    }

    public int getOposto() {
        return this.oposto;
    }

    public String toString() {
        return String.format("Triângulo retângulo com hipotenusa = %d, cateto oposto = %d e cateto adjacente = %d",
                getHipotenusa(),
                getOposto(),
                getAdjacente());
    }

    @Override
    public void setLados(int lados) { }

    @Override
    public int getLados() {
        return 0;
    }
}
