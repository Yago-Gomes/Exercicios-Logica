public class Principal {

    public static void main(String args[]) {
     
        System.out.println("\f");
        
        Pessoa pessoa = new Pessoa();
        
        //antiga....
        //pessoa.nome = "Thiago"; 
        
        //nova
        pessoa.setNome("Thiago"); //enviando para a classe
        pessoa.setIdade(36);
        
        //mostrar só o nome:
        System.out.println(pessoa.getNome()); //pegar o nome
        
        System.out.println(pessoa);//toString        
        
    }
}