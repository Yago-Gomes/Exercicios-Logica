public class Pessoa {

    //4 tipos de encapsulamento no Java.
    //public, package, private, protected
    private String nome; //dog...
    private int idade;
    
    //métodos acessores - get(pegar)/set(setar, enviar)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        //primeira maneira
        //escopo global         escopo local
        //this.nome =             nome;
        
        //Segunda maneira
        //if
        /*if(nome.length() >= 2) {
            this.nome           =   nome;
        } else {
            this.nome           =   "Nome não informado";
        }*/
        
        //Terceira maneira
        this.nome = (nome.length() >= 2) ? nome : "Nome não informado";
        
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = (idade>0) ? idade : 0;
    }
    
    public int calcularIdadeMeses() {
        return this.idade * 12;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.getNome()
            + "\nIdade: " + this.getIdade()
            + "\nIdade em meses: " + this.calcularIdadeMeses(); 
    }
}