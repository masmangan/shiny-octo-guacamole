

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CirculoTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CirculoTest
{
    /**
     * Construtor default para a classe de teste CirculoTest
     */
    public CirculoTest()
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
    public void test2()
    {
        Circulo circulo = new Circulo(2.00);
        assertEquals(12.5664, circulo.getArea(), 0.0001);
    }

    @Test
    public void test100()
    {
        Circulo circulo = new Circulo(100.64);
        assertEquals(31819.3103, circulo.getArea(), 0.0001);
    }
    
    @Test
    public void test150()
    {
        Circulo circulo = new Circulo(150.00);
        assertEquals(70685.7750, circulo.getArea(), 0.0001);
    }    
}

