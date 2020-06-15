public class Principal {
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Esquadria esquadria = new Esquadria();
        esquadria.setDescricao("Esquadria generica");
        System.out.println(esquadria.getDescricao());
     
        Porta porta1 = new Porta();
        porta1.setDescricao("porta do quarto");
        System.out.println(porta1.getDescricao());
        
        Janela janela1 = new Janela(); 
        janela1.setDescricao("janela do quarto");
        janela1.setTipoDeAbertura("guilhotina");
        System.out.println(janela1.getDescricao()
                           + "\ntipo de abertura: " 
                           + janela1.getTipoDeAbertura());
                           
                           
        Porta porta2 = new Porta();
        porta2.setDescricao("porta do banheiro");
        porta2.setTipoDeDobradica("normal de metal");
        System.out.println(porta2.getDescricao()
                         + "\ntipo de dobradiça: " 
                         +  porta2.getTipoDeDobradica());                           
                         
                         
        Porta porta3 = new Porta();
        porta3.setDescricao("porta da sacada");
        porta3.setTipoDeDobradica("normal de plastico");
        System.out.println(porta3);
        
       
        Esquadria esquadria1 = new Esquadria("pou");
        System.out.println(esquadria1);
        
        
        Porta porta4 = new Porta("xxy", "ferro");
        System.out.println(porta4);
    }
}