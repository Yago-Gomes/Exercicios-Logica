public class PrincipalTeste {
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        A a = new A();
        a.setDescricao("abc");
        System.out.println(a.getDescricao());
        
        B b = new B();
        b.setDescricao("xyz");
        b.setNumero(10);
        System.out.println(b.getDescricao()
                        + "\nNumero: " + b.getNumero());
        
    }
}