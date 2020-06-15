/**
 * @author Thiago Cury
 * @version 1.0
 * @since 27/05/2020 - 10:20
 * @category View
 */
public class Principal {
    /**
     * Explicação.
     */
    public static void main(String args[]) {
    
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Thiago");
        pessoa.setIdade(36);
        
        System.out.println(pessoa);
        System.out.println("Idade elevada: " + pessoa.calcularIdadeAoExpoente(2));
    }
}