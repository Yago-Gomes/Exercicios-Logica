import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Yago Gomes
 * @version 1.0
 * @since 01/06/2020 - 03:17 PM
 * @category Test
 */
public class NadadorTest {
    
    private Nadador nadador = new Nadador();
    
    public NadadorTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    /**
     * Teste para verificar a categoria do nadador.
     */
    @Test
    public void testVerificarCategoria() {
        nadador.setIdade(19);
        assertEquals("Adulto", nadador.verificarCategoria());
        
        nadador.setIdade(15);
        assertEquals("Juvenil", nadador.verificarCategoria());
        
        nadador.setIdade(9);
        assertEquals("Infantil", nadador.verificarCategoria());
        
        nadador.setIdade(5);
        assertEquals("Não pode ser nadador. Mínimo oito anos.", nadador.verificarCategoria());
    }
}