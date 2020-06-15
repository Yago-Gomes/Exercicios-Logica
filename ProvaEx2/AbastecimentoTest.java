import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Yago Gomes
 * @version 1.0
 * @since 02:04 PM
 * @category Test
 */
public class AbastecimentoTest {
    
    private Abastecimento abastecimento = new Abastecimento();
    
    public AbastecimentoTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    /**
     * Teste para calcular o valor do abastecimento. 
     */
    @Test
    public void testCalcularPrecoAbastecimento() {
        abastecimento.setTipoCombustivel(1);
        abastecimento.setLitrosAbastecidos(10.2);
        assertEquals(45.798, abastecimento.calcularPrecoAbastecimento(), 0.1);
        
        abastecimento.setTipoCombustivel(2);
        abastecimento.setLitrosAbastecidos(25.7);
        assertEquals(94.576, abastecimento.calcularPrecoAbastecimento(), 0.1);
        
        abastecimento.setTipoCombustivel(3);
        abastecimento.setLitrosAbastecidos(37.9);
        assertEquals(140.609, abastecimento.calcularPrecoAbastecimento(), 0.1);
        
        abastecimento.setTipoCombustivel(4);
        abastecimento.setLitrosAbastecidos(15.8);
        assertEquals(70.942, abastecimento.calcularPrecoAbastecimento(), 0.1);
    }
}
