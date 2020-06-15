import java.util.Scanner;

/**
 * @author Yago Gomes
 * @version 1.0
 * @since 28-05-2020 12:33AM
 */
public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.println("Digite o seu nome: ");
        aluno.setNome(scanner.nextLine());
        
        System.out.println("Digite a sua N1:");
        aluno.setNota1(scanner.nextDouble());
        
        System.out.println("Digite a sua N2:");
        aluno.setNota2(scanner.nextDouble());
        
        aluno.setNumeroAulas(30);
        aluno.setNumeroPresencas(25);
        
        System.out.println(aluno);
    }
}