import java.util.Scanner;

/**
 * @author Yago Gomes
 * @version 1.0
 * @since 01/06/2020 - 01:30 PM
 * @category View
 */
public class Principal {
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Trimestre trimestre = new Trimestre();
        
        System.out.println("Digite o seu mês de nascimento(número):");
        trimestre.setMes(scanner.nextInt());
        System.out.println(trimestre);
    }
}