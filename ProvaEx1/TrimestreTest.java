import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Yago Gomes
 * @version 1.0
 * @since 01/06/2020 - 01:18 PM
 * @category Test
 */
public class TrimestreTest {
    
    private Trimestre trimestre = new Trimestre();
    
    public TrimestreTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    /**
     * Teste para verificar o trimestre conforme o mes digitado.
     */
    @Test
    public void testVerificarTrimestre() {
        trimestre.setMes(1);
        assertEquals("Janeiro. Primeiro Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(2);
        assertEquals("Fevereiro. Primeiro Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(3);
        assertEquals("Março. Primeiro Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(4);
        assertEquals("Abril. Primeiro Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(5);
        assertEquals("Maio. Segundo Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(6);
        assertEquals("Junho. Segundo Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(7);
        assertEquals("Julho. Segundo Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(8);
        assertEquals("Agosto. Segundo Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(9);
        assertEquals("Setembro. Terceiro Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(10);
        assertEquals("Outubro. Terceiro Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(11);
        assertEquals("Novembro. Terceiro Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(12);
        assertEquals("Dezembro. Terceiro Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes(13);
        assertEquals("Esse mês não existe!", trimestre.verificarTrimestre());
    }
}
