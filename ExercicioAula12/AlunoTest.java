import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author  Yago Gomes
 * @version 1.0
 * @since 28-05-2020 12:10AM
 */
public class AlunoTest {
    
    Aluno aluno = new Aluno();
    
    public AlunoTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        aluno.setNumeroAulas(50);
        aluno.setNumeroPresencas(42);
        aluno.setNota1(8.9);
        aluno.setNota2(7.5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCalcularFrequencia() {
        assertEquals(84, aluno.calcularFrequencia(), 0.0);
        
        aluno.setNumeroPresencas(35);
        assertEquals(70, aluno.calcularFrequencia(), 0.0);
        
        aluno.setNumeroPresencas(48);
        assertEquals(96, aluno.calcularFrequencia(), 0.0);
    }
    
    @Test
    public void testCalcularMedia() {
        assertEquals(8.2, aluno.calcularMedia(), 0.0);
        
        aluno.setNota1(10);
        aluno.setNota2(7.5);
        assertEquals(8.75, aluno.calcularMedia(), 0.0);
        
        aluno.setNota1(5.5);
        aluno.setNota2(8);
        assertEquals(6.75, aluno.calcularMedia(), 0.0);
    }
}
