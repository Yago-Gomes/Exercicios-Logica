import java.util.Scanner;

/**
 * @author Yago Gomes
 * @version 1.0
 * @since 02:40 PM
 * @category View
 */
public class Principal {
    public static void main(String args[]) {
   
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       Abastecimento abastecimento = new Abastecimento();
       
       System.out.println("Escolha o número do combustivel:\n1-Gasolina\n2-Álcool\n3-Diesel\n4-Flex");
       abastecimento.setTipoCombustivel(scanner.nextInt());
       System.out.println("Quantos litros foram abastecidos?");
       abastecimento.setLitrosAbastecidos(scanner.nextInt());
       System.out.println(abastecimento);
    }
}