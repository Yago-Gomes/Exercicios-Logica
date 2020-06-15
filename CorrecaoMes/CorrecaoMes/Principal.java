import java.util.Scanner;
/**
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 31/05/2020 - 22:05
 * @category View
 */
public class Principal {
   public static void main(String args[]) {
   
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       Mes mes = new Mes();
       mes.setMes(1);
       System.out.println(mes);       
       
       System.out.println("Digite um mês(número):");
       mes.setMes(scanner.nextInt());
       System.out.println(mes);
       
   }
}
