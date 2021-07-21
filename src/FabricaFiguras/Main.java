package FabricaFiguras;

import Singleton.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Fábrica de Figuras Geométricas =========");

        // CIRCULOS
        System.out.println("========= Construindo circulos");
        System.out.println("Construindo uma círculo: ");
        Circulo c1 = Circulo.getInstance();
        c1.setRaio(5);
        System.out.println(c1);

        System.out.println("\nConstruindo outro círculo: ");
        Circulo c2 = Circulo.getInstance();
        System.out.println(c2); // Somente 1 instância de circulo é permitida

        // TRIANGULOS
        System.out.println("\n========= Construindo triangulos");
        System.out.println("========= Equilateros");
        System.out.println("Construindo um equilatero: ");
        TrianguloEquilatero t1 = TrianguloEquilatero.getInstance();
        t1.setLados(3);
        System.out.println(t1);

        System.out.println("\nConstruindo outro equilatero: ");
        TrianguloEquilatero t2 = TrianguloEquilatero.getInstance();
        System.out.println(t2);

        System.out.println("\n========= Isosceles");
        System.out.println("Construindo um isosceles: ");
        TrianguloIsosceles t3 = TrianguloIsosceles.getInstance();
        t3.setBase(7);
        t3.setLados(3);
        System.out.println(t3);

        System.out.println("\nConstruindo outro isosceles: ");
        TrianguloIsosceles t4 = TrianguloIsosceles.getInstance();
        System.out.println(t4);

        System.out.println("\n========= Retangulo");
        System.out.println("Construindo um t. retangulo: ");
        TrianguloRetangulo t5 = TrianguloRetangulo.getInstance();
        t5.setHipotenusa(10);
        t5.setAdjacente(6);
        t5.setOposto(5);
        System.out.println(t5);

        System.out.println("\nConstruindo outro t. retangulo: ");
        TrianguloRetangulo t6 = TrianguloRetangulo.getInstance();
        System.out.println(t6);

        // QUADRADOS
        System.out.println("\n========= Construindo quadrados");
        System.out.println("Construindo um quadrado: ");
        Quadrado q1 = Quadrado.getInstance();
        q1.setLados(5);
        System.out.println(q1);

        System.out.println("\nConstruindo outro quadrado: ");
        Quadrado q2 = Quadrado.getInstance();
        q2.setLados(8);
        System.out.println(q2);

        System.out.println("\nConstruindo outro quadrado: ");
        Quadrado q3 = Quadrado.getInstance();
        q3.setLados(12);
        System.out.println(q3);
    }
}
