

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of class Aluno here.
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 28/05/2020 - 09:20
 * @category Test
 */
public class AlunoTest {
    
    private Aluno aluno = new Aluno();
    
    /**
     * Default constructor for test class AlunoTest
     */
    public AlunoTest() {
        aluno.setNome("Thiago");
        aluno.setNota1(10);
        aluno.setNota2(9);   
        aluno.setTotalAulas(10);
        aluno.setNumeroPresencas(8);        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        aluno.setNota1(10);
        aluno.setNota2(9);   
        aluno.setTotalAulas(10);
        aluno.setNumeroPresencas(8); 
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
    /**
     * 
     * Teste realizado com 10(total aulas) e 8(num presencas).
     * Segundo teste realizado com 10(total aulas) e 4(num presencas).
     */
    @Test
    public void testCalcularFrequencia() {
        assertEquals(80, aluno.calcularFrequencia(), 0.0);
        
        aluno.setTotalAulas(10);
        aluno.setNumeroPresencas(4);
        assertEquals(40, aluno.calcularFrequencia(), 0.0);
        
    }
    
    /**
     * 
     * Teste realizado com 10 e 9.
     * Segundo teste realizado com 10 e 4.
     */
    @Test
    public void testCalcularMediaAritmetica() {
        assertEquals(9.5, aluno.calcularMediaAritmetica(), 0.0);
        
        aluno.setNota1(8);
        aluno.setNota2(9);        
        assertEquals(8.5, aluno.calcularMediaAritmetica(), 0.0);
    }  
    
    /**
     * 
     * Teste realizado com 10 e 9.
     * Segundo com 5 e 5.
     */    
    @Test
    public void testVerificarAprovacao() {
        assertEquals("Aprovado", aluno.verificarAprovacao());
        aluno.setNota1(5);
        aluno.setNota2(5);        
        assertEquals("Reprovado", aluno.verificarAprovacao());        
    }     
           
    /**
     * 
     * Teste realizado com 10 e 9.
     * Segundo com 5 e 5 para nota 1 e nota 2. total de aulas 10 e numero de presenças 4.
     */    
    @Test
    public void testVerificarAprovacaoMediaEFrequencia() {
        assertEquals("Aprovado", aluno.verificarAprovacaoMediaEFrequencia());
        aluno.setNota1(5);
        aluno.setNota2(5);  
        aluno.setTotalAulas(10);
        aluno.setNumeroPresencas(4);        
        assertEquals("Reprovado", aluno.verificarAprovacaoMediaEFrequencia());        
    }  
    
    /**
     * 
     * Teste realizado com 10 e 9.
     * Segundo teset com 9.2 e 8
     * Terceiro com 6.5 e 7
     * Quarto com 5 e 3
     */    
    @Test
    public void testVerificarConceito() {
        assertEquals("A", aluno.verificarConceito());
        
        aluno.setNota1(9.2);
        aluno.setNota2(8);  
        assertEquals("B", aluno.verificarConceito());
        
        aluno.setNota1(6.5);
        aluno.setNota2(7);  
        assertEquals("C", aluno.verificarConceito());  
        
        aluno.setNota1(5);
        aluno.setNota2(3);  
        assertEquals("D", aluno.verificarConceito());                
    }     
}
