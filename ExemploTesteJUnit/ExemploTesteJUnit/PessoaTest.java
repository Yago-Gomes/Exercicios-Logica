import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PessoaTest.
 *
 * @author  Thiago Cury
 * @version 1.0
 */
public class PessoaTest {
        
    Pessoa pessoa = new Pessoa();
        
    public PessoaTest() {
        pessoa.setNome("Thiago");
        pessoa.setIdade(2); //2 anos
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        pessoa.setIdade(2);
        System.out.println("passou no setup");
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
        System.out.println("passou no tearDown");
    }
    
    @Test
    public void testCalcularIdadeMeses() {
        System.out.println("passou no idade meses");
        assertEquals(24, pessoa.calcularIdadeMeses());

        pessoa.setIdade(1);
        assertEquals(12, pessoa.calcularIdadeMeses());
    }
    
    @Test
    public void testCalcularIdadeSemanas() {
        System.out.println("passou no idade semanas");        
        assertEquals(96, pessoa.calcularIdadeSemanas());
    }
    
    @Test
    public void testCalcularIdadeMesesVirgula() {
        System.out.println("passou no idade meses virgula");        
        assertEquals(24.0, pessoa.calcularIdadeMesesVirgula(), 0.0);
    }
    
    @Test
    public void testJuntarNomeEIdade() {
        System.out.println("passou no juntar nome idade");        
        assertEquals("Thiago 2", pessoa.juntarNomeEIdade());
    }
}
