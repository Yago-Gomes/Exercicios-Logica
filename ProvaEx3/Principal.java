import java.util.Scanner;

/**
 * @author Yago Gomes
 * @version 1.0
 * @since 01/06/2020 - 03:23 PM
 * @category View
 */
public class Principal {
    public static void main(String args[]) {
   
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       Nadador nadador = new Nadador();
       
       System.out.println("Digite seu nome:");
       nadador.setNome(scanner.nextLine());
       System.out.println("Digite a sua idade:");
       nadador.setIdade(scanner.nextInt());
       System.out.println(nadador);
    }
}