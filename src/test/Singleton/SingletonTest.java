package test.Singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import Singleton.*;
import org.junit.After;

/**
 * Singleton Tester.
 *
 * @author <Authors name>
 * @since <pre>out 5, 2020</pre>
 * @version 1.0
 */
public class SingletonTest {
    @Test
    public void testCirculo() throws Exception {
        Circulo c1 = Circulo.getInstance();
        c1.setRaio(5);
        Circulo c2 = Circulo.getInstance();

        Assert.assertEquals(c1, c2);
        Assert.assertEquals(c1.getRaio(), c2.getRaio());
    }

    @Test
    public void testTrianguloEquilatero() throws Exception {
        TrianguloEquilatero t1 = TrianguloEquilatero.getInstance();
        t1.setLados(3);
        TrianguloEquilatero t2 = TrianguloEquilatero.getInstance();

        Assert.assertEquals(t1, t2);
        Assert.assertEquals(t1.getLados(), t2.getLados());
    }

    @Test
    public void testTrianguloIsosceles() throws Exception {
        TrianguloIsosceles t1 = TrianguloIsosceles.getInstance();
        t1.setBase(6);
        t1.setLados(8);
        TrianguloIsosceles t2 = TrianguloIsosceles.getInstance();

        Assert.assertEquals(t1, t2);
        Assert.assertEquals(t1.getBase(), t2.getBase());
        Assert.assertEquals(t1.getLados(), t2.getLados());
    }

    @Test
    public void testTrianguloRetangulo() throws Exception {
        TrianguloRetangulo t1 = TrianguloRetangulo.getInstance();
        t1.setHipotenusa(12);
        t1.setOposto(8);
        t1.setAdjacente(4);
        TrianguloRetangulo t2 = TrianguloRetangulo.getInstance();

        Assert.assertEquals(t1, t2);
        Assert.assertEquals(t1.getHipotenusa(), t2.getHipotenusa());
        Assert.assertEquals(t1.getAdjacente(), t2.getAdjacente());
        Assert.assertEquals(t1.getOposto(), t2.getOposto());
    }

    @Test
    public void testQuadrado() throws Exception {
        Quadrado q1 = Quadrado.getInstance();
        q1.setLados(4);
        Quadrado q2 = Quadrado.getInstance();
        q2.setLados(6);

        Assert.assertNotEquals(q1, q2);
        Assert.assertNotEquals(q1.getLados(), q2.getLados());
    }
}
