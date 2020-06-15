import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AlunoTest.
 *
 * @author  Thiago Cury
 * @version 1.0 
 * @since 28/05/2020 - 14:19
 * @category Test 
 */
public class AlunoTest {
    
    private Aluno aluno = new Aluno();
    
    public AlunoTest() {
        aluno.setNome("Thiago");
        aluno.setNota1(10);
        aluno.setNota2(3);
        aluno.setTotalAulas(10);
        aluno.setNumeroPresencas(8);
    }

    @Before
    public void setUp() {
        aluno.setNome("Thiago");
        aluno.setNota1(10);
        aluno.setNota2(9);     
        aluno.setTotalAulas(10);
        aluno.setNumeroPresencas(8);        
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testSetNome() {
        aluno.setNome("Ze");
        assertEquals("Ze", aluno.getNome());
    }
    
    @Test
    public void testCalcularMediaAritmetica() {
        //Conversao conversao = new Conversao();
        //assertEquals(3.33, conversao.formatar(aluno.calcularMediaAritmetica()), 0.0);
        
        
        assertEquals(9.5, aluno.calcularMediaAritmetica(), 0.0);        
    }
    
    @Test
    public void testCalcularFrequencia() {
        assertEquals(80.0, aluno.calcularFrequencia(), 0.0);
        
        aluno.setTotalAulas(10);
        aluno.setNumeroPresencas(4);   
        assertEquals(40.0, aluno.calcularFrequencia(), 0.0);        
        
    }    
    
    @Test
    public void testToString() {
        assertEquals("\nNome: Thiago\nNota 1: 10.0\nNota 2: 9.0\nTotal de aulas: 10.0\nNúmero de presenças: 8.0\nFrequencia: 80.0%\nMédia: 9.5", aluno.toString());
    }
    
}
