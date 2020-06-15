public class Principal {
    
    public static void principal(String args[]) {
    
        System.out.println("\f");
    
        Produto produto = new Produto();
    
        produto.setNumero1(10.5);
        produto.setNumero2(5.75);
        produto.setNumero3(25.9);
  
        System.out.println(produto);
    }
}