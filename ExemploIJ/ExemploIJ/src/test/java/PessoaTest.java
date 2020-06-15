import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Thiago Cury
 * @since 02/06/2020 - 10:11
 * @version 1.0
 */
class PessoaTest {

    private Pessoa pessoa = new Pessoa();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        pessoa.setNome("Zé");
        pessoa.setIdade(1);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * Verificando a idade em meses.
     */
    @org.junit.jupiter.api.Test
    void calcularIdade() {
        assertEquals(12, pessoa.calcularIdade());
    }
}