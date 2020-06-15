public class Principal {

    public static void main(String args[]) {

        System.out.println("\f");
        
        //classe objeto = new construtor
        Pessoa pessoa1 = new Pessoa(); //inserindo na memória.
        pessoa1.setNome("Thiago");
        pessoa1.setIdade(36);
        System.out.println("\nNome: " + pessoa1.getNome()
                         + "\nIdade: " + pessoa1.getIdade());
        
        Pessoa pessoa2 = new Pessoa("Zé"); //inserindo na memória.
        System.out.println("\nNome: " + pessoa2.getNome());    
        
        Pessoa pessoa3 = new Pessoa("Paula", 18); //inserindo na memória.
        System.out.println("\nNome: " + pessoa3.getNome()
                         + "\nIdade: " + pessoa3.getIdade());
    }
}