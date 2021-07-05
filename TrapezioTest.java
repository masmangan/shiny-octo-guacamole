

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste TrapezioTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class TrapezioTest
{
    /**
     * Construtor default para a classe de teste TrapezioTest
     */
    public TrapezioTest()
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
    public void test3And4And5Dot2()
    {
        Trapezio t1 = new Trapezio(3.0, 4.0, 5.2);
        assertEquals(18.2, t1.getArea(), 0.001);
    }    

    @Test
    public void test12Dot7And10Dot4And15Dot2()
    {
        Trapezio t1 = new Trapezio(12.7, 10.4, 15.2);
        assertEquals(175.56, t1.getArea(), 0.001);
    }
}
