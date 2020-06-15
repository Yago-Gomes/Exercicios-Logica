import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yago
 * @version 1.0
 * @since 07/06/2020 - 9:12 PM
 * @category test
 */
class FuncionarioTest {

    private Funcionario funcionario = new Funcionario();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * Retorna o calculo do salario com a adição do FGTS
     */
    @org.junit.jupiter.api.Test
    void calcularAdicaoFGTS() {
        funcionario.setSalario(1200);
        assertEquals(1296.0, funcionario.calcularAdicaoFGTS());
    }
}