import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 31/05/2020 - 22:01
 * @category Test
 */
public class MesTest {
   
    private Mes mes = new Mes();
    
    public MesTest() {
        mes.setMes(2);
    }

    @Before
    public void setUp() {
        mes.setMes(2);        
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testValidarMes() {
        assertEquals("Fevereiro", mes.validarMes());
        mes.setMes(1);
        assertEquals("Janeiro", mes.validarMes()); 
        mes.setMes(3);
        assertEquals("Março", mes.validarMes());         
        mes.setMes(4);
        assertEquals("Abril", mes.validarMes());         
        mes.setMes(5);
        assertEquals("Maio", mes.validarMes());         
        mes.setMes(6);
        assertEquals("Junho", mes.validarMes());         
        mes.setMes(7);
        assertEquals("Julho", mes.validarMes());         
        mes.setMes(8);
        assertEquals("Agosto", mes.validarMes());         
        mes.setMes(9);
        assertEquals("Setembro", mes.validarMes());         
        mes.setMes(10);
        assertEquals("Outubro", mes.validarMes());         
        mes.setMes(11);
        assertEquals("Novembro", mes.validarMes());         
        mes.setMes(12);
        assertEquals("Dezembro", mes.validarMes());         
    }
}
