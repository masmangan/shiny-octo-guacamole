

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste TrianguloTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class TrianguloTest
{
    /**
     * Construtor default para a classe de teste TrianguloTest
     */
    public TrianguloTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test3And5Dot2()
    {
        Triangulo triangul1 = new Triangulo(3.0, 5.2);
        assertEquals(7.8, triangul1.getArea(), 0.001);
    }

    @Test
    public void test12Dot7And15Dot2()
    {
        Triangulo triangul1 = new Triangulo(12.7, 15.2);
        assertEquals(96.52, triangul1.getArea(), 0.001);
    }
}

