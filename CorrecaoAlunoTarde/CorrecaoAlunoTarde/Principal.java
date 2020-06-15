import java.util.Scanner;

/**
 *
 * @author Thiago Cury
 * @version 1.0 
 * @since 28/05/2020 - 14:19
 * @category View
 */
public class Principal {
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome:");
        aluno.setNome(scanner.next());
        System.out.println("Digite a nota 1:");        
        aluno.setNota1(scanner.nextDouble());
        System.out.println("Digite a nota 2:");                
        aluno.setNota2(scanner.nextDouble());
        System.out.println("Digite o total de aulas:");                        
        aluno.setTotalAulas(scanner.nextDouble());
        System.out.println("Digite o número de presenças:");
        aluno.setNumeroPresencas(scanner.nextDouble());        
        System.out.println(aluno);
        
        //####
        
                
        System.out.println("Digite o nome:");
        String nome = scanner.next();
        System.out.println("Digite a nota 1:");        
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2:");                
        double nota2 = scanner.nextDouble();
        System.out.println("Digite o total de aulas:");                        
        double totalAulas = scanner.nextDouble();
        System.out.println("Digite o número de presenças:");
        double numeroPresencas = scanner.nextDouble();

        Aluno aluno1 = new Aluno(nome, nota1, nota2, totalAulas, numeroPresencas);
        
        System.out.println(aluno1);
    }
}
