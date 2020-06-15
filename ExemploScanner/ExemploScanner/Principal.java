import java.util.Scanner; //1 passo

public class Principal {
    
    public static void main(String args[]) {
     
        System.out.println("\f");
        
        //2 passo
        Scanner scanner = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        //3 passo
        System.out.println("Digite o seu nome: ");
        pessoa.setNome(scanner.nextLine());
        
        System.out.println(pessoa);
    }
}