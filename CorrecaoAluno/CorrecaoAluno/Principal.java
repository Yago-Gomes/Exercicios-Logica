/**
 * Write a description of class Aluno here.
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 28/05/2020 - 09:43
 * @category View
 */
public class Principal {
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Aluno aluno = new Aluno();
        aluno.setNome("Ze");
        aluno.setNota1(8.6);
        aluno.setNota2(7.2);
        aluno.setTotalAulas(6);
        aluno.setNumeroPresencas(5);
        
        System.out.println(aluno);
        
    }
}
