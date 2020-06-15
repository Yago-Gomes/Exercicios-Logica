import java.util.Scanner;

public class Principal {
 
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Cachorro cachorro = new Cachorro();
        System.out.println("Digite o nome do seu cachorro:");
        cachorro.setNome(scanner.next());
        
        System.out.println("Digite a idade do seu cachorro:");
        cachorro.setIdade(scanner.nextInt());
        System.out.println(cachorro);
        
        Gato gato = new Gato();
        System.out.println("Digite o nome do seu gato:");        
        gato.setNome(scanner.next());
        System.out.println(gato);                
        
    }    
}